package com.sda.exercises.Ex13;

import static java.lang.System.out;

public class Ex13 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("James");
        person.setSurname("Bond");
        person.setPesel(11111111111L);

        out.println(person.toString());
    }
}
