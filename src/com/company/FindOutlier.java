package com.company;

import java.util.Arrays;

public class FindOutlier {
    public static void main(String[] args) {
        int[] exampleTest1 = {2,6,8,-10,3};
        System.out.println(find(exampleTest1));
    }

    static int find(int[] integers){
        int oddCounter=0;
        int evenCounter=0;
        int position=0;

        for (int i = 0; i < integers.length; i++) {
            if(integers[i]%2==0){
                evenCounter++;
            } else oddCounter++;
        }
        return 0;
    }
}
