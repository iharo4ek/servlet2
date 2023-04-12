package by.tms.servlet2.entity;

public class Operation {

    private double num1;
    private double num2;
    private  OperationTypes type;
    private double result;

    public Operation(double num1, double num2, OperationTypes type) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
    }

    public Operation(double num1, double num2, OperationTypes type, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
        this.result = result;
    }


    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setType(OperationTypes type) {
        this.type = type;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public OperationTypes getType() {
        return type;
    }

    public double getResult() {
        return result;
    }
}
