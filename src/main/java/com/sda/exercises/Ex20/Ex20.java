package com.sda.exercises.Ex20;

import java.util.LinkedHashSet;

public class Ex20 {
    public static void main(String[] args) {
        //create new FIFO set
        LinkedHashSet<String> queue = new LinkedHashSet<>();
        //adds elements to set
        queue.add("Do");
        queue.add("it");
        queue.add("faster,");
        queue.add("make");
        queue.add("us");
        queue.add("stronger.");
        queue.add("Harder,");
        queue.add("Better,");
        queue.add("Faster,");
        queue.add("Stronger.");

        //print elements of list
        queue.forEach(el -> System.out.println(el));
    }
}
