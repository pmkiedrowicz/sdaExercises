package com.sda.exercises.Ex5;

import static java.lang.System.out;

public class Ex5 {
    static String getHashtag() {
        //simple return hashtag
        return "#";
    }

    public static void main(String[] args) {
        //loop for next row
        for (int i = 0; i < 4; i++) {
            //loop to print hashtag
            for (int j = 0; j < 4; j++) {
                out.print(getHashtag() + " ");
            }
            out.println();
        }
    }
}
