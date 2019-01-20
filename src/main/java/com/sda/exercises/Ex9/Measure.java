package com.sda.exercises.Ex9;

import java.awt.*;

public class Measure {
    public double x1 = 23;
    public double y1 = 44;
    public double x2 = 55;
    public double y2 = 66;

    public double distance(Point p1, Point p2) {
        Double xx=(p1.getX() - p2.getX())*(p1.getX()-p2.getX());
        Double yy=(p1.getY()-p2.getY())*(p1.getY()-p2.getY());
        Double num = Math.sqrt(xx+yy);
        return num;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}
