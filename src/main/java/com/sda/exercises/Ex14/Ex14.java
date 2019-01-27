package com.sda.exercises.Ex14;

import java.util.*;

public class Ex14 {
    //basic randomizer with range(min, max) ability
    static int randomIntWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) ((Math.random() * range) + min);
    }

    public static void main(String[] args) {
        //initialize finalList of numbers
        ArrayList<Integer> finalList = new ArrayList<>();
        //initialize list of repeated numbers
        TreeMap<Integer, Integer> repeatedList = new TreeMap<>();

        //while output list is less than 100 elements...
        while (finalList.size() < 100) {
            //random an number in range of 0,200
            int temp = randomIntWithRange(0, 200);
            //if the output list contains that number...
            if (finalList.contains(temp)) {
                //if the HashMap contains that number...
                if (repeatedList.containsKey(temp)) {
                    //...get value of a key and increment it
                    int nn = repeatedList.get(temp).intValue();
                    nn++;
                    //and put back on HashMap
                    repeatedList.put(temp, nn);
                    //otherwise set value of a key to 1
                } else {
                    repeatedList.put(temp, 1);
                }
            }
            //adds number to finalList
            finalList.add(temp);
        }

        //initialize maxValue
        int maxValue = 0;

        //iterate through treeset to get max value
        for (Map.Entry<Integer, Integer> item : repeatedList.entrySet()) {
            if (item.getValue() > maxValue) {
                maxValue = item.getValue();
            }
        }

        //initialize counter to get max 5 items
        int counter = 0;

        //while theres less than 5 items and maxValue is still over 0()
        while (counter < 5 && maxValue > 0) {
            for (Map.Entry<Integer, Integer> item : repeatedList.entrySet()) {
                //makes sure loop will break if counter reaches 5 items
                if (counter >= 5) {
                    break;
                } else {
                    //if item value == maxValue, show number + repeats
                    if (item.getValue() == maxValue) {
                        System.out.println("Repeated number: " + item.getKey() + " has been repeated " + item.getValue() + "time(s)");
                        //increment counter +1
                        counter++;
                    }
                }
            }
            //if theres no item left in repeatedList maxValue decrement -1
            maxValue--;
        }
    }
}
