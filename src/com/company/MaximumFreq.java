package com.company;

import java.util.List;

public class MaximumFreq {
    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(List.of(3, 2, 1, 3)));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = 0;
        int count = 0;
        for (Integer candle : candles) {
            if (candle > max) {
                max = candle;
            }

        }
        for (Integer candle : candles) {
            if (candle == max) {
                count++;
            }
        }
        return count;

    }
}
