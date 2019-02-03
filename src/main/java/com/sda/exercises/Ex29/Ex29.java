package com.sda.exercises.Ex29;

import static java.lang.System.out;

public class Ex29 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            //added extra sleep() to see thread working
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //create two threads
        Ex29 t1 = new Ex29();
        Ex29 t2 = new Ex29();
        //start first thread
        t1.start();
        //join to finish first thread and...
        t1.join();
        //...start other thread
        t2.start();
    }
}
