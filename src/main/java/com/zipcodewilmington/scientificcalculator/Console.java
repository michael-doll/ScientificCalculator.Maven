package com.zipcodewilmington.scientificcalculator;

import com.sun.tools.corba.se.idl.InvalidArgument;

import java.util.InputMismatchException;
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

    public static Double getDoubleInput(String prompt) {
        Double userDouble = 0.0;

        try {
            println(prompt);
            Scanner scanner = new Scanner(System.in);
            userDouble = scanner.nextDouble();
        }catch (Exception np) {
            Console.println("Err.. [0] to clear"); // continues without clearing, this statement is a requirement in the readme
        }
        return userDouble;
    }

    public static Integer getMenuInput(String prompt) {
        boolean flag = true; // flag for menu input validation
        Integer userMenuSelection = -1; // set outside of menu boundaries, prompts for menu input
        do {
            try {
                while (userMenuSelection < 0 || userMenuSelection > 5){ // Must be updated for further menu options
                    Console.println(" [1] Add\n [2] subtract\n [3] multiply \n [4] divide\n [0] clear\n [5] exit\n");
                    println(prompt);
                    Scanner scanner = new Scanner(System.in);
                    userMenuSelection = scanner.nextInt();
                }
                return userMenuSelection;
            } catch (Exception e) {
                Console.println("Not a valid menu selection..");
                flag = false;
            }
        }while (!flag); // condition for menu input validation
        return userMenuSelection;
    }


}
