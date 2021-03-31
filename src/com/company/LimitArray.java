package com.company;

public class LimitArray {
    public static void main(String[] args) {
        int[] test = new int[]{78, 117, 110, 99, 104, 117, 107, 115};
        System.out.println(smallEnough(test, 117));
    }

    /**
     * You will be given an array and a limit value. You must check that all values in the array are
     * below or equal to the limit value. If they are, return true. Else, return false.
     * @param array
     * @param limit
     * @return
     */
    public static boolean smallEnough(int[] array, int limit) {
        var num =0;
        for (int j : array) {
            if (j > limit)
                num = j;
        }
        return num <= limit;
    }
}
