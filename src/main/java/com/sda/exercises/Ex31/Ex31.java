package com.sda.exercises.Ex31;

import java.util.Scanner;

import static java.lang.System.out;

public class Ex31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number number = new Number();
        float radius = -1;
        float height = -1;
        //flags
        boolean flagRad = false;
        boolean flagHei = false;
        //while any of flag are false, continue
        while (flagRad != true || flagHei != true) {
            //if radius is default value, execute
            if (radius == -1) {
                out.println("Type radius: ");
                String rad = sc.nextLine();
                //if user typed a valid value, set radius value and change flagRad
                if (number.isFloat(rad) == true) {
                    radius = Float.parseFloat(rad);
                    flagRad = true;
                }
            }
            //if height is default value, execute
            if (height == -1) {
                out.println("Type height: ");
                String hei = sc.nextLine();
                //if user typed a valid value, set height value and change flagHei
                if (number.isFloat(hei) == true) {
                    height = Float.parseFloat(hei);
                    flagHei = true;
                }
            }
        }
        //calculate the capacity and println to user
        out.println("Cylinder capacity: " + number.cylinderCapacity(radius, height));
    }
}
