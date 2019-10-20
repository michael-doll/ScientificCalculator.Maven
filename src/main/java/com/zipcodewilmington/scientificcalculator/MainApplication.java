package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        boolean power = true;
        Console.println("Welcome to my calculator!\n");

        while (calcOn(power)){
            Double dOne = Console.getDoubleInput("Enter your first value : ");
            Console.println("Current Value : " + dOne);
            Integer menuInput = Console.getMenuInput("Enter the operation to perform  : ");
            if(menuInput == 5){power = false; break;}
            Double dTwo = Console.getDoubleInput("Enter your second value : ");
//        String toDisplay  = Display.getDisplay(i);// Figure out how to do this

            Calculator calc = new Calculator();
            String toDisplay = Double.toString(calc.calculate(dOne, dTwo, menuInput));

//        Console.println("The user input %s as an integer for their menu selection", i); //Displays menu selection
//        Console.println("The user input %s as a d", dOne); // Displays first user input for operation
//        Console.println("The user input %s as a d", dTwo); // Displays second user input for operation
            Console.println(toDisplay);
        }
    }
    public static boolean calcOn(boolean power){
        return (power);
    }

}
