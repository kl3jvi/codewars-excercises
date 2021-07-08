package com.company;

public class Staircase {
    public static void main(String[] args) {
        staircase(2);
    }


    /**
     * 4-1
     * 3-2
     * 2-3
     * 1-4
     * 5-0
     *
     * @param n
     */
    public static void staircase(int n) {
        // Write your code here
        int i, j, k;
        for (i = n; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (k = n; k >= i; k--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
