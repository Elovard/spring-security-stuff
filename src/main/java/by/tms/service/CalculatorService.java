package by.tms.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private int sum (int firstNum, int secondNum){
        int result = firstNum + secondNum;
        return result;
    }

    private int diff(int firstNum, int secondNum){
        int result = firstNum - secondNum;
        return result;
    }

    private int div(int firstNum, int secondNum){
        int result = firstNum % secondNum;
        return result;
    }

    private int mult(int firstNum, int secondNum){
        int result = firstNum * secondNum;
        return result;
    }

    public Operation getResult(Operation oper){
        switch (oper.getOper()){
            case "sum":
                oper.setResult(sum(oper.getFirstNum(), oper.getSecondNum()));
                break;
            case "div":
                oper.setResult(div(oper.getFirstNum(), oper.getSecondNum()));
                break;
            case "mult":
                oper.setResult(mult(oper.getFirstNum(), oper.getSecondNum()));
                break;
            case "diff":
                oper.setResult(diff(oper.getFirstNum(), oper.getSecondNum()));
                break;
        }
        return oper;
    }
}
