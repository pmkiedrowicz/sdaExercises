package com.sda.exercises.Ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1 {
    static int lineNumber;
    static String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    static void writeOut(String tekst) {
        System.out.println(lineNumber + 1 + ": " + tekst);
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        //adding table list to an ArrayList
        arr.addAll(Arrays.asList(daysOfWeek));
        //iterate through all elements of an array
        while (lineNumber < arr.size()) {
            //print actual element with method writeOut()
            writeOut(arr.get(lineNumber));
            //increment lineNumber
            lineNumber += 1;
        }
    }
}
