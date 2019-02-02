package com.sda.exercises.Ex2;

import static java.lang.System.out;

public class Ex2 {
    static double count(double x) {
        //multiple x*x plus 3
        return x * x + 3;
    }

    static void writeOut(double x, double y) {
        //print data
        out.println("Dala x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            writeOut(i, count(i));
        }
    }
}
