package com.company;

import java.util.Arrays;

public class JosephSurvivor {
    public static void main(String[] args) {
        System.out.println(josephusSurvivor(7, 3));
    }

    public static int josephusSurvivor(final int n, final int k) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < arr.length; i+=k) {

        }
        System.out.println(Arrays.toString(arr));
        return 1;
    }
}
