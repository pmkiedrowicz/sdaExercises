package com.sda.exercises.Ex4;

public class Ex4 {
    static double count(double x) {
        //multiple x*x plus 3
        return x * x + 3;
    }

    static void writeOut(double x, double y) {
        //print data
        System.out.println("Dala x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        for (double i = 1; i <= 10; i++) {
            //check if the 'i' value is pair
            writeOut(i, count(i));
            i -= 0.5d;
        }
    }
}