package com.company;

/**
 * Write a function called repeatStr which repeats the given string string exactly n times.
 */
public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(5,"kot"));
    }

    public static String repeatStr(final int repeat, final String string) {
        return String.valueOf(string).repeat(Math.max(0, repeat));
    }
}
