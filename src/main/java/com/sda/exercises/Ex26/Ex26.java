package com.sda.exercises.Ex26;

import java.util.ArrayList;

import static java.lang.System.out;

public class Ex26 {
    public static void main(String[] args) {
        //initialize new list of type Worker
        ArrayList<Worker> list = new ArrayList<>();
        //add workers to a list
        list.add(new Worker("Liam", "Smith", 10000));
        list.add(new Worker("William", "Smith", 1000));
        list.add(new Worker("James", "Smith", 2500));
        list.add(new Worker("Liam", "Smith", 3000));
        list.add(new Worker("Jan", "Smith", 8000));
        list.add(new Worker("Mason", "Smith", 6000));
        list.add(new Worker("Elijah", "Smith", 5000));
        list.add(new Worker("Kathrine", "Smith", 12000));
        list.add(new Worker("Abraham", "Smith", 1200));
        list.add(new Worker("Ana", "Smith", 2900));

        //find average salary, additional save to a pole
        double average = list.stream()
                //filter to use only salary
                .mapToDouble(Worker::getSalary)
                //find average
                .average()
                //return as Double
                .getAsDouble();
        //print average salary
        out.println("Averagee salary: " + average);

        //find Workers with salary over average
        list.stream()
                //filter workers which salary is more than average
                .filter(el -> el.getSalary() > average)
                //print workers
                .forEach(el -> out.println("Name: " + el.getName() + ", Surname: " + el.getSurname() + ", Salary: " + el.getSalary()));
    }
}
