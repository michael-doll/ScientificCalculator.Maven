package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        boolean power = true; // Calculator is on
        Console.println("Welcome to my calculator!\n");

        Double dOne = Console.getDoubleInput("Enter your first value : ");
        while (calcOn(power)){ // Checks power status
            Console.println("Current Value : " + dOne);
            Integer menuInput = Console.getMenuInput("Enter the operation to perform  : ");

            if(menuInput == 5){power = false; break;} // chekcs power status, exits
            if(menuInput == 0){
                dOne = Console.getDoubleInput("Enter your first value : "); // on clear, sets to zero and prompts to input new value
                menuInput = Console.getMenuInput("Enter the operation to perform  : "); // should be able to do this without repeating myself
            }

                Double dTwo = Console.getDoubleInput("Enter your second value : ");

            Calculator calc = new Calculator(); //Calculator to perform operation

            dOne = calc.calculate(dOne, dTwo, menuInput); // updates current value

//        Console.println("The user input %s as an integer for their menu selection", i); //Displays menu selection
//        Console.println("The user input %s as a d", dOne); // Displays first user input for operation
//        Console.println("The user input %s as a d", dTwo); // Displays second user input for operation
            Console.println(Display.getDisplay(Double.valueOf(dOne)));

        }
    }
    public static boolean calcOn(boolean power){
        return (power);
    }

}
