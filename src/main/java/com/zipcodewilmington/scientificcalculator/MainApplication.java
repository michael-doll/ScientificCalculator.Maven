package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");   Stub Code
//        Integer i = Console.getIntegerInput("Enter an integer");  Stub Code
//        Double d = Console.getDoubleInput("Enter a double."); Stub Code
//        Console.println("The user input %s as a string", s); Stub Code
//        Console.println("The user input %s as a integer", i); Stub Code
//        Console.println("The user input %s as a d", d); Stub Code

        Double dOne = Console.getDoubleInput("Enter your first value : ");
        Integer i = Console.getMenuInput("Enter the operation to perform  : ");
        Double dTwo = Console.getDoubleInput("Enter your second value : ");
//        String toDisplay  = Display.getDisplay(i);// Figure out how to do this


        Calculator calc = new Calculator();
        String toDisplay = Double.toString(calc.calculate(dOne,dTwo,i));



        Console.println("The user input %s as an integer for their menu selection", i); //Displays menu selection

        Console.println("The user input %s as a d", dOne); // Displays first user input for operation
        Console.println("The user input %s as a d", dTwo); // Displays second user input for operation
        Console.println(toDisplay);
    }

}
