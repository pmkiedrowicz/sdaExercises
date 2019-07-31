package com.sda.exercises.Ex32;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        //Type a number of bounds
        int bounds = 10;
        fibonacci.printArray(fibonacci.calculateFibonacci(bounds));
    }
}
