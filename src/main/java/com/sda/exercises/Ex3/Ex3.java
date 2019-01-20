package com.sda.exercises.Ex3;

public class Ex3 {
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
            //check if the 'i' value is pair
            if (i % 2 == 0) {
                writeOut(i, count(i));
            }
        }
    }
}
