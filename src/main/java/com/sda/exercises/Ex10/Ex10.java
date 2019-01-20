package com.sda.exercises.Ex10;

import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a num1");
        int x = Integer.parseInt(sc.nextLine());

        System.out.println("Type a num2");
        int y = Integer.parseInt(sc.nextLine());

        System.out.println("Type a num3");
        int z = Integer.parseInt(sc.nextLine());

        sc.close();

        List list = new ArrayList();
        list.add(x);
        list.add(y);
        list.add(z);

        System.out.println("Minimum value: " + Collections.min(list));
        System.out.println("Maximum value: " + Collections.max(list));
        System.out.println("Sum of numbers: " + (x + y + z));
    }
}