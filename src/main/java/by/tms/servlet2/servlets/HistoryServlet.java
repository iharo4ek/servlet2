package by.tms.servlet2.Servlets;

import by.tms.servlet2.entity.Operation;
import by.tms.servlet2.storage.InMemoryoperationStorage;
import by.tms.servlet2.storage.OperationStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value="/history",name="HistoryServlet")
public class HistoryServlet extends HttpServlet {
    private final OperationStorage storage = InMemoryoperationStorage.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Operation> list = storage.findAll();
        req.setAttribute("list", list);
        req.getRequestDispatcher("pages/history.jsp").forward(req, resp);
    }
}
