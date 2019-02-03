package com.sda.exercises.Ex21;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex21Test {
    UserInput userInput = new UserInput();

    @Test
    public void checkTextInputIfNull() {
        //given
        String text = null;

        //when

        //then
        assertFalse("Should return false as the input is null value", userInput.checkTextInput(text));
    }

    @Test
    public void checkTextInputIfItsString() {
        //given
        String text = "Kathrine";

        //when

        //then
        assertTrue("Should return true as the input is String value", userInput.checkTextInput(text));
    }

    @Test
    public void checkTextInputIfStringItsEmpty() {
        //given
        String text = "";

        //when

        //then
        assertFalse("Should return false as the input String value is empty", userInput.checkTextInput(text));
    }


}