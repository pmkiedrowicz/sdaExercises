package com.sda.exercises.Ex13;

public class Person {
    private String name;
    private String surname;
    private long pesel;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Surname: " + surname +
                ", Pesel: " + pesel;
    }
}
