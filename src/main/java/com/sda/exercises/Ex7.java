package com.sda.exercises;

import static java.lang.System.out;

public class Ex7 {
    static int mp(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            if (i == 0) {
                out.println(" * |  1  2  3  4  5  6  7  8  9");
                out.println("-------------------------------");
            }
            if (i == 1) {
                out.print(" " + i + " " + "|  ");
                for (int j = 1; j <= 9; j++) {
                    out.print(mp(i, j) + "  ");
                    if (j == 9) {
                        out.println();
                    }
                }
            }
            if (i == 2) {
                out.print(" " + i + " " + "|  ");
                for (int j = 1; j < 4; j++) {
                    out.print(mp(i, j) + "  ");
                }
                for (int j = 4; j <= 9; j++) {
                    out.print(mp(i, j) + " ");
                    if (j == 9) {
                        out.println();
                    }
                }
            }
            if (i == 3) {
                out.print(" " + i + " " + "|  ");
                for (int j = 1; j < 3; j++) {
                    out.print(mp(i, j) + "  ");
                }
                for (int j = 3; j <= 9; j++) {
                    out.print(mp(i, j) + " ");
                    if (j == 9) {
                        out.println();
                    }
                }
            }
            if (i == 4) {
                out.print(" " + i + " " + "|  ");
                for (int j = 1; j < 2; j++) {
                    out.print(mp(i, j) + "  ");
                }
                for (int j = 2; j <= 9; j++) {
                    out.print(mp(i, j) + " ");
                    if (j == 9) {
                        out.println();
                    }
                }
            }

            if (i > 4) {
                out.print(" " + i + " " + "|  " + i + " ");
                for (int j = 2; j <= 9; j++) {
                    out.print(mp(i, j) + " ");
                    if (j == 9) {
                        out.println();
                    }
                }
            }
        }
    }
}

