package com.sda.exercises.Ex15;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex15Test {

    @Test
    public void randomIntWithRange() {
        //given
        int min = -50;
        int max = 50;
        int num;
        //when
        for (int i = 0; i < 1000; i++) { //1000 tries assume num is different
            num = Ex15.randomIntWithRange(min, max);

            //then
            assertTrue("num should be less or equal max value", num <= max);
            assertTrue("num should be more or equal min value", num >= min);
        }
    }
}