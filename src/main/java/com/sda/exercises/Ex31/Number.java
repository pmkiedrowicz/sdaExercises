package com.sda.exercises.Ex31;

public class Number {
    //basic cylinderCapacity method
    public double cylinderCapacity(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    //basic isFloat checker
    public boolean isFloat(String number) {
        if (number == null) {
            return false;
        }
        try {
            //Determine if given number is an Float. If not return false.
            Float.parseFloat(number);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
}
