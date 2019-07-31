package com.sda.exercises.Ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    static Fibonacci fibonacci = new Fibonacci();

    @Test
    void calculateFibonacci() {
        //given
        int[] b = {-1, 0, 1, 2, 5, 20, 30};
        int[] a0 = {0};
        int[] a1 = {0};
        int[] a2 = {0};
        int[] a3 = {1, 1};
        int[] a4 = {1, 1, 2, 3, 5};
        int[] a5 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765};
        int[] a6 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040};
        //when

        //then
        assertArrayEquals(a0, fibonacci.calculateFibonacci(b[0]));
        assertArrayEquals(a1, fibonacci.calculateFibonacci(b[1]));
        assertArrayEquals(a2, fibonacci.calculateFibonacci(b[2]));
        assertArrayEquals(a3, fibonacci.calculateFibonacci(b[3]));
        assertArrayEquals(a4, fibonacci.calculateFibonacci(b[4]));
        assertArrayEquals(a5, fibonacci.calculateFibonacci(b[5]));
        assertArrayEquals(a6, fibonacci.calculateFibonacci(b[6]));
    }

    @Test
    void printArray() {
    }
}