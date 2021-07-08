package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameCountere {
    public static void main(String[] args) {
        System.out.println(breakingRecords(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1)));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int maximum = -1;
        int minimum = Integer.MAX_VALUE;
        int maxCtr = -1;
        int minCtr = -1;

        for (Integer score : scores) {
            if (score < minimum) {
                minimum = score;
                minCtr++;
            }
            if (score > maximum) {
                maximum = score;
                maxCtr++;
            }
        }
        List<Integer> returnList = new ArrayList<>();
        returnList.add(maxCtr);
        returnList.add(minCtr);
        return returnList;
    }
}


