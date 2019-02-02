package com.sda.exercises.Ex17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex17 {
    public static void main(String[] args) {
        //import class to randomize numbers
        Random random = new Random();
        //new list to collect Integers
        List<Integer> list = new ArrayList<>();

        //number of random bounds
        int numberOfRepeats = 10;

        //adding new elements to a list
        for (int i = 0; i < numberOfRepeats; i++) {
            list.add(random.nextInt());
        }

        //print elements of a list
        for (Integer el : list) {
            System.out.println(el);
        }
    }
}
