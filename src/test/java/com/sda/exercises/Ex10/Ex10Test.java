package com.sda.exercises.Ex10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Ex10Test {

    @Test
    public void isItInteger() {
        //given
        String num1 = null;
        String num2 = "";
        String num3 = "-123";
        String num4 = "123";
        String num5 = "-2147483648";
        String num6 = "-2147483649";
        String num7 = "2147483647";
        String num8 = "2147483648";

        //when

        //then
        assertFalse(Ex10.isInteger(num1));
        assertFalse(Ex10.isInteger(num2));
        assertTrue(Ex10.isInteger(num3));
        assertTrue(Ex10.isInteger(num4));
        assertTrue(Ex10.isInteger(num5));
        assertFalse("Value is one less Integer minimum value", Ex10.isInteger(num6));
        assertTrue(Ex10.isInteger(num7));
        assertFalse("Value is one over Integer maximum value", Ex10.isInteger(num8));
    }

    @Test
    public void sumAllListElementsWhenListIsNull() {
        //given
        List<Integer> list = new ArrayList<>();
        //when

        //then
        assertNull("Should return null, list is null.", Ex10.sumIntegerList(list));
    }

    @Test
    public void sumAllListElements() {
        //given
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(-200);
        list.add(-37);

        //when

        //then
        assertEquals("Should return -114", Integer.valueOf(-114), Ex10.sumIntegerList(list));
    }
}