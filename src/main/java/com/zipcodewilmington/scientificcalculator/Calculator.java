package com.zipcodewilmington.scientificcalculator;

import java.util.Map;
import java.util.HashMap;

public class Calculator {
    private double num1;
    private double num2;
    private Integer operation;
    private boolean power;

    private Map<Integer, Operations> operationMap = new HashMap<Integer, Operations>(); // This was a nice idea, not mine.. but a good one

    public Calculator () {

        operationMap.put(1, new Addition());
        operationMap.put(2, new Subtraction());
        operationMap.put(3, new Multiply());
        operationMap.put(4, new Divide());
        operationMap.put(0, new Clear());


    }

    public double calculate(double num1, double num2, Integer operation){
        Operations operationVal = operationMap.get(operation);
        return operationVal.calculation(num1, num2);
    }

    public boolean getPower(){
        return power;
    }
    public void setPower(boolean power){
        this.power = power;
    }

}
