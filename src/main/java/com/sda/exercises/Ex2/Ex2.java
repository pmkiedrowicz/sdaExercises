package com.sda.exercises.Ex2;

public class Ex2 {
    static double count(double x) {
        return x * x + 3;
    }

    static void writeOut(double x, double y) {
        System.out.println("Dala x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            writeOut(i, count(i));
        }
    }
}
