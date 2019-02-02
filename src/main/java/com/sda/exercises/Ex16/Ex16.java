package com.sda.exercises.Ex16;

import java.util.TreeSet;

public class Ex16 {
    public static void main(String[] args) {
        //create new set sorted by default
        TreeSet<String> treeSet = new TreeSet<>();
        //adds five elements to set
        treeSet.add("Sophia");
        treeSet.add("Mark");
        treeSet.add("Kathrene");
        treeSet.add("Julia");
        treeSet.add("Kimmie");

        //display all elements of set
        for (String el : treeSet) {
            System.out.println(el);
        }
    }
}
