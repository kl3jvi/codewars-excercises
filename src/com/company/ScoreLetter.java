package com.company;

public class ScoreLetter {
    public static void main(String[] args) {
        System.out.println(high("what time are we climbing up to the volcano"));
    }



    public static String high(String x) {
        String[] words = x.split(" ");
        int mx = 0;
        String res = "";
        for (String s : words) {
            int counter = 0;
            for (int j = 0; j < s.length(); j++) {
                counter += (s.charAt(j) - 96);
            }
            if (counter > mx) {
                mx = counter;
                res = s;
            }
        }
        return res;
    }
}
