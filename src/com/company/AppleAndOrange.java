package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {
    public static void main(String[] args) {
        countApplesAndOranges(7, 10, 4, 12, List.of(2, 3, -4), List.of(3, -2, -4));
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        //calculate apples

        int appleCtr = 0;
        int orangeCtr = 0;

        for (Integer apple : apples) {
            if (apple + a >= s && apple + a <= t) {
                appleCtr++;
            }
        }
        for (Integer orange : oranges) {
            if (orange + b >= s && orange + b <= t) {
                orangeCtr++;
            }
        }

        System.out.println(appleCtr + "\n" + orangeCtr);
    }

}
