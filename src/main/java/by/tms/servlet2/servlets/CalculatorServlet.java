package by.tms.servlet2.servlets;

import by.tms.servlet2.entity.Operation;
import by.tms.servlet2.entity.OperationTypes;
import by.tms.servlet2.service.CalculatorService;

import by.tms.servlet2.storage.InMemoryoperationStorage;
import by.tms.servlet2.storage.OperationStorage;
import by.tms.servlet2.util.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/calc", name = "CalculatorServlet")// http://localhost:8080/calc
public class CalculatorServlet extends HttpServlet {
    private final Calculator calculator = CalculatorService.getInstance();
    private final OperationStorage storage = InMemoryoperationStorage.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pages/calculate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sNum1 = "";
        String sNum2 = "";
        String sType = "";
        double num1 = 0;
        double num2 = 0;
        OperationTypes type = null;
        sNum1 = req.getParameter("num1");
        sType = req.getParameter("type");
        sNum2 = req.getParameter("num2");
        num1 = Double.parseDouble(sNum1);
        num2 = Double.parseDouble(sNum2);
        type = OperationTypes.valueOf(sType);

        Operation operation = new Operation(num1, num2, type);
        operation = calculator.calculate(operation);
        storage.save(operation);

        req.setAttribute("num1", operation.getNum1());
        req.setAttribute("num2", operation.getNum2());
        req.setAttribute("result", operation.getResult());
        req.getRequestDispatcher("pages/calculate.jsp").forward(req, resp);
    }
}
