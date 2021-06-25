package com.company;

import java.util.HashSet;
import java.util.List;

public class Predator {
    public static void main(String[] args) {
        System.out.println(sockMerchant(9, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    public static int minimumGroups(List<Integer> predators) {
        int max = 1;
        int arrLen = predators.size();
        for (var i = 0; i < predators.size() - 1; i++) {
            var a = i;
            var counter = 1;
            while (predators.get(a) > -1 && predators.get(a) < arrLen && counter < arrLen) {
                a = predators.get(a);
                counter++;
            }

            if (counter > max)
                max = counter;
        }
        return max;
    }

    public static int sockMerchant(int n, List<Integer> arr) {
        // Write your code here
        HashSet<Integer> unmatched = new HashSet<>();
        int pairs = 0;
        for (Integer integer : arr) {
            if (!unmatched.add(integer)) {
                unmatched.remove(integer);
                pairs++;
            }
        }
        return pairs;
    }
}
