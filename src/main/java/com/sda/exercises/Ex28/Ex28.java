package com.sda.exercises.Ex28;

import static java.lang.System.out;

public class Ex28 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            out.println(i);
        }
    }

    public static void main(String[] args) {
        //create two threads
        new Ex28().start();
        new Ex28().start();
    }
}
