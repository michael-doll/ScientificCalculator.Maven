package com.zipcodewilmington.scientificcalculator;

import com.sun.tools.internal.ws.wsdl.document.Operation;

public class Multiply implements Operations {
    public double calculation(double num1, double num2){
        return num1 * num2;
    }
}
