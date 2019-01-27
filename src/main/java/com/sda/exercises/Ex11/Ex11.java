package com.sda.exercises.Ex11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Ex11 {
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

        //initialize boolean to stop loop
        boolean flag = false;

        out.println("Type numbers. Press \"end\" to break.");
        while (flag == false) {
            out.println("Make sure an given number is Integer value.");
            String temp = sc.nextLine();
            if (temp.equals("end")) {
                flag = true;
            } else {
                //if the given string is a number continue
                if (isInteger(temp) == true) {
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
