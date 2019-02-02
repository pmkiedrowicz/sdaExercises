package com.sda.exercises.Ex6;

import static java.lang.System.out;

public class Ex6 {
    public static void main(String[] args) {
        //initial number
        int n = 18762;
        //number to divide (*10)
        int divider = 1;

        //loop of elements
        for (int i = 0; i < 5; i++) {
            //divide by divider, and get the rest
            int nn = (n / divider) % 10;
            out.print(nn + " ");
            //multiple divider by 10
            divider *= 10;
        }
    }
}
