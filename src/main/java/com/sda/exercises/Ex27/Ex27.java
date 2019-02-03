package com.sda.exercises.Ex27;

import static java.lang.System.out;

public class Ex27 implements Runnable {
    public void run() {
        out.println("Hello world");
    }

    public static void main(String[] args) {
        new Ex27().run();
    }
}
