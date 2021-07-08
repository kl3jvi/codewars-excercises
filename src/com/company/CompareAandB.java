package com.company;

import java.util.ArrayList;
import java.util.List;

public class CompareAandB {
    public static void main(String[] args) {
        System.out.println(compareTriplets(List.of(17, 28, 30), List.of(99, 16, 8)));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> list = new ArrayList();
        int aliceSum = 0;
        int bobSum = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceSum++;
            } else if (a.get(i) < b.get(i)) {
                bobSum++;
            }
        }
        list.add(aliceSum);
        list.add(bobSum);
        return list;
    }
}
