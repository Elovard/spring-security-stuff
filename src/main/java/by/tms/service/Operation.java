package by.tms.service;

public class Operation {
    private int firstNum;
    private int secondNum;
    private String oper;
    private int result;

    public Operation() {
    }

    public Operation(int firstNum, int secondNum, String oper) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.oper = oper;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                ", oper='" + oper + '\'' +
                ", result=" + result +
                '}';
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
