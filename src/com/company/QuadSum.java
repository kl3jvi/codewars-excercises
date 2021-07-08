package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuadSum {
    public static void main(String[] args) {
        miniMaxSum(List.of(7, 69, 2, 221, 8974));
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int sum = 0;
        ArrayList<Integer> newList = new ArrayList(arr);
        Collections.sort(newList);

        for (Integer num : newList) {
            sum += num;
        }
        System.out.println((sum - newList.get(4)) + " " + (sum - newList.get(0)));
    }
}
