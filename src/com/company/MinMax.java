package com.company;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] test = new int[]{5};
        System.out.println(Arrays.toString(minMax(test)));
    }

    /**
     *
     * Ben has a very simple idea to make some profit: he buys something and sells it again.
     * Of course, this wouldn't give him any profit at all if he was simply to buy and sell
     * it at the same price. Instead, he's going to buy it for the lowest possible price and
     * sell it at the highest.
     *
     * Write a function that returns both the minimum and maximum number of the given list/array.
     */
    public static int[] minMax(int[] arr) {
        // Your awesome code here
        int min=arr[0];
        int max=arr[0];
        if(arr.length==1){
            return new int[]{arr[0], arr[0]};
        }else if(arr.length==2){
            if(arr[0]>arr[1])
                return new int[]{arr[1], arr[0]};
            else  return new int[]{arr[0], arr[1]};
        }
        else
            for (int j : arr) {
                if (j < min)
                    min = j;
                else if (j > max)
                    max = j;
            }
        return new int[]{min, max};
    }
}
