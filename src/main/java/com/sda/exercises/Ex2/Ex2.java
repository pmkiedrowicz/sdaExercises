package com.sda.exercises.Ex2;

public class Ex2 {
    static double count(double x) {
        //multiple x*x plus 3
        return x * x + 3;
    }

    static void writeOut(double x, double y) {
        //print data
        System.out.println("Dala x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            writeOut(i, count(i));
        }
    }
}
