package com.sda.exercises.Ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Ex10 {

    static boolean isInteger(String temp) {
        if (temp == null) {
            return false;
        }
        try {
            //Determine if given number is an Integer. If not return false.
            Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    static Integer sumIntegerList(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            int sum = 0;
            sum = list.stream().mapToInt(Integer::intValue).sum();
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //initialize empty list of type Integer
        List<Integer> list = new ArrayList<>();

        //initialize counter to finish loop
        int counter = 0;

        out.println("Type 3 numbers. Press \"end\" to break.");
        //if counter reaches 3 program will end
        while (counter < 3) {
            out.println("Make sure an given number is Integer value. \nYou've choosen " + counter + " of 3 numbers");
            String temp = sc.nextLine();
            if (temp.equals("end")) {
                counter = 3;
            } else {
                //if the given string is a number continue
                if (isInteger(temp) == true) {
                    //increment counter
                    counter++;
                    //parse an string to integer value
                    int num = Integer.parseInt(temp);
                    //add temporary num to a list
                    list.add(num);
                }
            }
        }
        sc.close();
        //stream all list elements and sum all of them
        out.println("Sum of all elemnts: " + sumIntegerList(list));
    }
}
