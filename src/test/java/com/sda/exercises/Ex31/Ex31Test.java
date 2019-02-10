package com.sda.exercises.Ex31;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex31Test {
    Number number = new Number();

    @Test
    public void cylinderCapacity() {
        //given
        float radius1 = 2;
        float height1 = 2;
        float radius2 = 5.883f;
        float height2 = 8.234f;
        //when

        //then
        assertEquals(25.1327, number.cylinderCapacity(radius1, height1), 0.0001);
        assertEquals(895.2790, number.cylinderCapacity(radius2, height2), 0.0001);
        assertNotEquals(25.1327, number.cylinderCapacity(radius1, height2), 0.0001);
    }

    @Test
    public void isFloat() {
        //given
        String num1 = "";
        String num2 = "23";
        String num3 = "23.3";
        String num4 = "23.3666";
        String num5 = "23.3f";
        //when

        //then
        assertFalse(number.isFloat(num1));
        assertTrue(number.isFloat(num2));
        assertTrue(number.isFloat(num3));
        assertTrue(number.isFloat(num4));
        assertTrue(number.isFloat(num5));
    }
}