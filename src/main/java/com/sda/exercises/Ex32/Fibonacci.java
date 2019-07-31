package com.sda.exercises.Ex32;

public class Fibonacci {
    //Main method to calculate Fibonacci sequence
    static int[] calculateFibonacci(int bounds) {
        //First if statement checks if no. of bounds is less than 2
        //If true return array with one element
        if (bounds < 2) {
            int[] ar = new int[1];
            return ar;
        } else {
            //Initialize new array with the no. of elements equals bounds
            int[] arr = new int[bounds];
            //Initialize first two elements and assign value '1'
            arr[0] = 1;
            arr[1] = 1;
            //For every next element assign value of sum two previous elements
            for (int i = 2; i < bounds; i++) {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
            return arr;
        }
    }

    //Method to print all elements of array
    void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + ", ");
        }
    }
}
