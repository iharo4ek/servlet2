package by.tms.servlet2.service;

import by.tms.servlet2.entity.Operation;
import by.tms.servlet2.storage.InMemoryoperationStorage;
import by.tms.servlet2.storage.OperationStorage;
import by.tms.servlet2.util.Calculator;


public class CalculatorService implements Calculator {

    private static CalculatorService instance;

    private CalculatorService() {}

    public static CalculatorService getInstance() {
        if (instance == null) {
            instance = new CalculatorService();
        }
        return instance;
    }

    public Operation calculate(Operation operation) {
        switch (operation.type) {
            case SUM:
                operation.result = operation.num1 + operation.num2;
                return operation;
            case SUB:
                operation.result = operation.num1 - operation.num2;
                return operation;
            case MUL:
                operation.result = operation.num1 * operation.num2;
                return operation;
            case DIV:
                operation.result = operation.num1 / operation.num2;
                return operation;
        }
        return operation;
    }



}
