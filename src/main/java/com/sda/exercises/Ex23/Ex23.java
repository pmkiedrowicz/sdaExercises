package com.sda.exercises.Ex23;

import java.util.ArrayList;
import java.util.List;

public class Ex23 {
    public static void main(String[] args) {
        //initialize new list
        List<String> list = new ArrayList<>();
        //adds elements to list
        list.add("Liam");
        list.add("William");
        list.add("James");
        list.add("Liam");
        list.add("Jan");
        list.add("Mason");
        list.add("Elijah");
        list.add("Kathrine");
        list.add("Abraham");
        list.add("Jan");

        list.stream()
                //filter elements with string "Jan"
                .filter(el -> el.equals("Jan"))
                //print each element which passes filter
                .forEach(el -> System.out.println(el));
    }
}
