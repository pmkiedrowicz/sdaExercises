package com.sda.exercises.Ex30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.System.out;

public class Ex30 implements Runnable {
    public void run() {
        //message of a start of thread
        out.println(Thread.currentThread().getName() + " (Start of thread)");
        //display current thread & loop for counting 1-10
        for (int i = 1; i <= 10; i++) {
            out.println(Thread.currentThread().getName() + " " + i);
        }
        //message of end of thread
        out.println(Thread.currentThread().getName() + " (End of thread)");//prints thread name
    }

    public static void main(String[] args) {
        //adds 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads
        //execute all threads
        executor.execute(new Ex30());
        executor.execute(new Ex30());
        executor.execute(new Ex30());
        executor.execute(new Ex30());
        executor.execute(new Ex30());
        //close executor
        executor.shutdown();

        out.println("Finished all threads");
    }
}
