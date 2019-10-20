package com.zipcodewilmington.scientificcalculator;


public class MainApplication {
    public static void main(String[] args) {
        boolean power = true; // Calculator is on
        Calculator calc = new Calculator();//Calculator to perform operation
        calc.setPower(power); // power on calculator
        Console.println("Welcome to my calculator!\n");


        Double dOne = Console.getDoubleInput("Enter your first value : ");
        while (calc.getPower()){ // Checks power status
            Console.println("Current Value : " + dOne); // consistently provides a visual of the current value
            Integer menuInput = Console.getMenuInput("Enter the operation to perform  : ");

            if(menuInput == 5){calc.setPower(false); break;} // checks power status, exits if menu prompt is selected
            if(menuInput == 0){
                dOne = Console.getDoubleInput("Enter your first value : "); // on clear, sets to zero and prompts to input new value
                menuInput = Console.getMenuInput("Enter the operation to perform  : "); // should be able to do this without repeating myself
            }
                Double dTwo = Console.getDoubleInput("Enter your second value : ");

            dOne = calc.calculate(dOne, dTwo, menuInput); // updates current value

            Console.println(Display.getDisplay(Double.valueOf(dOne))); // not sure if going to build out display further

        }
    }
}
