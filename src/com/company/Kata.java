package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {
    public static void main(String[] args) {
        highAndLow("5 4 -16 31 3 6 9");
    }

    public static String highAndLow(String numbers) {

        String[] test = numbers.split(" ");
        Integer[] num = new Integer[test.length];
        for (int i = 0; i < test.length; i++) {
            num[i] = Integer.parseInt(test[i]);
        }
        Arrays.sort(num, Comparator.comparingInt(Integer::signum));

        for (int i = 0; i < test.length; i++) {
            test[i] = String.valueOf(num[i]);
        }
        System.out.println(Arrays.toString(test));
        String returni = test[test.length-1]+"";
        return test[test.length-1]+""+test[0];
    }


}
