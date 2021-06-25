package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultiplesThreeFive {
    public static void main(String[] args) {
        System.out.println(solution(200));
    }

    public static int solution(int number) {
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
