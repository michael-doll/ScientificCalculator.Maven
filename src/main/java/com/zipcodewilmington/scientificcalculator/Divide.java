package com.zipcodewilmington.scientificcalculator;

import com.sun.tools.internal.ws.wsdl.document.Operation;

public class Divide implements Operations {
    public double calculation(double num1, double num2){
            if(num2 == 0){
                Console.println("Nope..");
                return 0;
            }
            return num1 / num2;
    }
}
