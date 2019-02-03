package com.sda.exercises.Ex25;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.System.out;

public class Ex25 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-300);
        list.add(-400);
        list.add(-500);
        list.add(300);
        list.add(400);
        list.add(100);

        list.stream()
                //sort the elements in natural order
                .sorted(Comparator.naturalOrder())
                //limit the output to first element
                .limit(1)
                //print
                .forEach(el -> out.println("Maximum value" + el));

        list.stream()
                //sort the elements in reverse order
                .sorted(Comparator.reverseOrder())
                //limit the output to first element
                .limit(1)
                //print
                .forEach(el -> out.println("Minimum value" + el));
    }
}
