package com.sda.exercises.Ex15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex15 {
    //basic randomizer with range(min, max) ability
    static int randomIntWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) ((Math.random() * range) + min);
    }

    public static void main(String[] args) {
        //new list with sorted elements
        List<Integer> list = new ArrayList<>();

        //add new elements to a list
        while (list.size() < 1000) {
            list.add(randomIntWithRange(1000, 2000));
        }

        //new list to sort out
        List<Integer> sortedList;
        //adds sorted elements of list to new sortedList
        sortedList = list.stream().sorted().collect(Collectors.toList());

        //get first and last element of sortedList
        System.out.println(sortedList.get(0));
        System.out.println(sortedList.get(999));
    }
}
