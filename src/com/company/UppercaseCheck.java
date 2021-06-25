package com.company;

import java.util.List;

public class UppercaseCheck {
    public static void main(String[] args) {
        System.out.println(simpleArraySum(List.of(1,2,4,5)));
    }

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum=0;
        for (Integer a: ar ) {
            sum+=a;
        }
        return sum;
    }

}
