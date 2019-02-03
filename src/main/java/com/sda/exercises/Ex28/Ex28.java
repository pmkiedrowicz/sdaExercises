package com.sda.exercises.Ex28;

import static java.lang.System.out;

public class Ex28 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            //added extra sleep() to see thread working
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        //create two threads
        new Thread(new Ex28()).start();
        new Thread(new Ex28()).start();
    }
}
