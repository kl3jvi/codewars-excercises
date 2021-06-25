package com.company;

import java.util.Arrays;

public class CircleOfChildren {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(distributionOfCandy(new int[]{1, 2, 3, 4, 5})));
        test(5);
    }

    public static int[] distributionOfCandy(int[] candies) {
        //coding and coding..
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]%2!=0){
                candies[i]++;
            }
        }
        int i=0;
        for ( i = 0; i < candies.length-1; i++) {
            candies[i+1] += candies[i]/2;
            candies[i] -= candies[i]/2;
        }
        System.out.println(i);
        return new int[2];
    }

    public static void test(int n){
        int result;
    }
}