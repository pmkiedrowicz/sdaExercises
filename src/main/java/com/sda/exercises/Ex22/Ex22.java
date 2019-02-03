package com.sda.exercises.Ex22;

import java.util.ArrayList;
import java.util.List;

public class Ex22 {
    public static void main(String[] args) {
        //initialize new List of type String
        List<String> list = new ArrayList<>();
        //add elements to a list
        list.add("Liam");
        list.add("Noah");
        list.add("William");
        list.add("James");
        list.add("Mason");

        list.stream()
                //map elements to a uppercase
                .map(el -> el.toUpperCase())
                //print each element
                .forEach(el -> System.out.println(el));
    }
}
