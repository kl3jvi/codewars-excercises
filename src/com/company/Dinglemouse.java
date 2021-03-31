package com.company;

import java.util.Arrays;

public class Dinglemouse {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        // Your code here!
        int catYears, dogYears;
        if(humanYears==1){
            catYears =15;
            dogYears = 15;
        } else if(humanYears ==2){
            catYears = 24;
            dogYears=24;
        } else {
            catYears = 24+ ((humanYears-2)*4);
            dogYears = 24 + ((humanYears-2)*5);
        }

        return new int[]{humanYears, catYears, dogYears};
    }

}