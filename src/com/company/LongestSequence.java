package com.company;

public class LongestSequence {
    public static void main(String[] args) {
        System.out.println(lcs("132535365", "123456789"));
    }
    public static String lcs(String x, String y) {
        // your code here
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < y.length(); j++) {
                if(x.charAt(i)==y.charAt(j)){
                    str.append(x.charAt(i));
                } else return "";
            }
        }
        return str.toString();
    }
}
