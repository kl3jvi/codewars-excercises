package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CubicLuck {
    public static void main(String[] args) {
        int[] test = new int[]{1,1,2,-2,5,2,4,4,-1,-2,5};
        System.out.println(findIt(test));
    }

    public static int findIt(int[] a) {
        ArrayList<Integer> sampleList = new ArrayList<>();
        for (int j : a) {
            sampleList.add(j);
        }
        int count = 0;
        for (int input : a) {
            int frequency = Collections.frequency(sampleList, input);
            if (frequency % 2 != 0) {
                return input;
            }
        }
        return count;
    }
}