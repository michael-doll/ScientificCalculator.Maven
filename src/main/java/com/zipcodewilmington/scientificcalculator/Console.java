package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }


    public static Double getDoubleInput(String prompt) {
        try {
            println(prompt);
            Scanner scanner = new Scanner(System.in);
            Double userDouble = scanner.nextDouble();
            return userDouble;
        }catch (Exception e){
            Console.println("Invalid input..");
        }
        return null;
    }

    public static Integer getMenuInput(String prompt) {
        try {
            Console.println(" [1] Add\n [2] subtract\n [3] multiply \n [4] divide\n [0] clear\n [5] exit");
            println(prompt);
            Scanner scanner = new Scanner(System.in);
            Integer userMenuSelection = scanner.nextInt();
            return userMenuSelection;
        } catch (Exception e) {
            Console.println("Not a valid menu selection..");
        }
        return null;
    }


}
