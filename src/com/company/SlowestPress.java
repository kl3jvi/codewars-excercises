package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlowestPress {

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();

        arr.add(0, List.of(9));
        arr.add(1, List.of(2));
        arr.add(2, List.of(0, 3));
        arr.add(2, List.of(20, 5));
        arr.add(2, List.of(2, 6));


//        System.out.println(slowestKey(arr));

        System.out.println((char)101);

    }

    public static char slowestKey(List<List<Integer>> keyTimes) {
        // Write your code here
        int m = 0;
        int x = 0;
        for (int i = 0; i < keyTimes.size() - 1; i++) {
            if (keyTimes.get(i).size() == 1) {
                keyTimes.get(i).add(1,0);
                System.out.println(keyTimes.get(i));
            } else {
                int diff = keyTimes.get(i + 1).get(1) - keyTimes.get(i).get(1);
                if (diff > m) {
                    m = diff;
                    x = keyTimes.get(i + 1).get(0);
                }
            }
        }
        return (char) ((char) x + 97);

    }

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = keysPressed.length();
        int maxTime = releaseTimes[0];
        char slowestKey = keysPressed.charAt(0);
        for (int i = 1; i < n; i++) {
            int dur = releaseTimes[i] - releaseTimes[i - 1];
            if (dur > maxTime) {
                maxTime = dur;
                slowestKey = keysPressed.charAt(i);
            } else if (dur == maxTime) {
                char key = keysPressed.charAt(i);
                if (key > slowestKey) {
                    slowestKey = key;
                }
            }
        }
        return slowestKey;
    }
}
