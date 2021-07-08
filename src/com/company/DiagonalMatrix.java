package com.company;

import java.util.List;

public class DiagonalMatrix {
    public static void main(String[] args) {
        System.out.println(diagonalDifference(List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9))));
    }

    // 1  2  3    | 0;0   0;2 ---> 3
    // 4  5  6    | 1;1   1;1 ---> 5
    // 7  8  9    | 2;2   2;0 ---> 7

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i).get(arr.size()-1-i);
            sum2 += arr.get(i).get(i);
        }
        System.out.println(sum1+" "+sum2);
        return Math.abs(sum1-sum2);
    }
}
