package com.sda.exercises.Ex7;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex7Test {

    @Test
    public void mp() {
        //given
        Ex7 ex7 = new Ex7();
        int x1 = 1;
        int x2 = 4;
        int x3 = 8;
        int y1 = 1;
        int y2 = 3;
        int y3 = 8;
        //when

        //then
        assertEquals("Expects multiply of values " + x1 + " * " + y1 + " = 1", 1, ex7.mp(x1, y1));
        assertEquals("Expects multiply of values " + x2 + " * " + y2 + " = 12", 12, ex7.mp(x2, y2));
        assertEquals("Expects multiply of values " + x3 + " * " + y3 + " = 64", 64, ex7.mp(x3, y3));
    }
}