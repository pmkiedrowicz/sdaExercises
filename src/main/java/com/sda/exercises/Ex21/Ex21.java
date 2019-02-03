package com.sda.exercises.Ex21;

import java.util.Scanner;

import static java.lang.System.out;

public class Ex21 {
    //user input pole
    private static String text = null;
    //userIput checking class
    static UserInput userInput = new UserInput();

    public static void main(String[] args) {
        //using Scanner for user input
        Scanner sc = new Scanner(System.in);
        //using FileLogger class to log events
        FileLogger fileLogger = new FileLogger();

        out.println("Add a valid name: ");
        //attept to get a scanner value
        text = sc.nextLine();

        //check if userInput is valid, if not ask for another one
        while (userInput.checkTextInput(text) == false) {
            fileLogger.saveWarnLog(text);
            text = sc.nextLine();
        }
        //if input is valid use fileLogger class to log information to a file
        if (userInput.checkTextInput(text) == true) {
            fileLogger.saveInfoLog(text);
        }

        //close the scanner
        sc.close();
    }
}
