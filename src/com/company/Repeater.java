package com.company;

import java.util.Arrays;

public class Repeater {
    public static void main(String[] args) {
        System.out.println(repeat("a ",50));
    }

    /**
     * Write a function named repeater() that takes two arguments
     * (a string and a number), and returns a new string where the
     * input string is repeated that many times.
     *
     * @param str String
     * @param n int
     * @return String
     */
    public static String repeat(String str, long n) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i <= n-1; i++) {
             strBuilder.append(str);
        }
        str = strBuilder.toString();
        return str;
    }
}
