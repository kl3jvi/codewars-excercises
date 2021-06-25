package com.company;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[] {2, 5, 34, 6}));
    }

    /**
     * Given a list of integers, determine whether the sum of its elements is odd or even.
     * Give your answer as a string matching "odd" or "even".
     * If the input array is empty consider it as: [0] (array with a zero).
     */
    public static String oddOrEven(int[] array) {
        // your code
        int sum=0;
        for (int no:array) {
            sum+=no;
        }
        return sum%2==0 ? "even" : "odd";
    }
}
