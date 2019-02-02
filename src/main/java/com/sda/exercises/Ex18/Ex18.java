package com.sda.exercises.Ex18;

import java.util.LinkedList;

public class Ex18 {
    public static void main(String[] args) {
        //create new FIFO list
        LinkedList<String> list = new LinkedList<>();
        //adds elements to list
        list.add("A1");
        list.add("B1");
        list.add("C1");
        list.add("D1");
        list.add("E1");
        list.add("F1");
        list.add("G1");
        list.add("H1");
        list.add("I1");
        list.add("J1");

        //print first element
        System.out.println(list.getFirst());
        //print last element
        System.out.println(list.getLast());
    }
}
