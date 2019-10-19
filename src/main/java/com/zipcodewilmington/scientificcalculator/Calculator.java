package com.zipcodewilmington.scientificcalculator;

import com.sun.org.apache.xpath.internal.operations.Operation;

import java.util.Map;
import java.util.HashMap;

public class Calculator {
    private double num1;
    private double num2;
    private Integer operation;

    private Map<Integer, Operations> operationMap = new HashMap<Integer, Operations>(); // This was a nice idea, not mine.. but a good one

    public Calculator () {

        operationMap.put(1, new Addition());
        operationMap.put(2, new Subtraction());

    }

    public double calculate(double num1, double num2, Integer operation){
        Operations operationVal = operationMap.get(operation);
        return operationVal.calculation(num1, num2);
    }


}
