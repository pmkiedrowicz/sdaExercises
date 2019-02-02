package com.sda.exercises.Ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.System.out;

public class Ex12 {
    public static void main(String[] args) {
        Random random = new Random();
        //initialize temporary num
        int num = 0;
        //initialize counter
        int count = 0;
        //initialize a List<Integer>
        List<Integer> list = new ArrayList<>();

        //while counter is less than 20...
        while (count < 20) {
            //...random a number of type int
            num = random.nextInt();
            out.println(num);
            //if list doesnt contain that number...
            if (!list.contains(num)) {
                //...add to a list and...
                list.add(num);
                //...add one to counter
                count++;
            }
        }
        //print all elements
        list.forEach(el -> out.println(el));
    }
}
