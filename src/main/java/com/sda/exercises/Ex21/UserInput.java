package com.sda.exercises.Ex21;

public class UserInput {
    //method to check user input, if valid return true, otherwise return false
    boolean checkTextInput(String text) {
        //if text value is null return false
        if (text == null) {
            return false;
            //if text value is empty return false
        } else if (text.equals("")) {
            return false;
            //otherwise return true
        } else return true;
    }
}
