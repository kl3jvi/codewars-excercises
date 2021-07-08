package com.company;

import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        plusMinus(List.of(1, 1, 0, -1, -1));
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positive = 0;
        int negative = 0;
        int zeros = 0;

        for (Integer num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        System.out.println(String.format("%.6f",(float) positive / arr.size()));
        System.out.println(String.format("%.6f",(float) negative / arr.size()));
        System.out.println(String.format("%.6f",(float) zeros / arr.size()));
    }
}
