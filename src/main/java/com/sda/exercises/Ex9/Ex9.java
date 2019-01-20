package com.sda.exercises.Ex9;

import java.awt.Point;

public class Ex9 {
    public static void main(String[] args) {
        Measure measure = new Measure();
        Point p1 = new Point();
        Point p2 = new Point();

        p1.setLocation(measure.x1, measure.y1);
        p2.setLocation(measure.x2, measure.y2);

        Double num = measure.distance(p1, p2);
        System.out.println(num);
    }
}
