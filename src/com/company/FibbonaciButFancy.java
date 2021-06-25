package com.company;

import java.math.BigInteger;

public class FibbonaciButFancy {
    public static void main(String[] args) {
        System.out.println(multiTable(5));
    }

    public static String multiTable(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            stringBuilder.append(i).append(" * ").append(num).append(" = ").append(i * num).append("\n");
        }
        // good luck
        return stringBuilder.toString().substring(0,stringBuilder.toString().length()-1);
    }
}

