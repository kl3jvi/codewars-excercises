package com.company;

public class VowelCount {
    public static void main(String[] args) {
        System.out.println(getCount("Kot pa lidhje"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        int[] vowels = {97,101,105,111,117};
        int length = str.replace(" ","").length();
        for (int i = 0; i < length ; i++) {
            for (int vowel : vowels) {
                if (str.replace(" ", "").charAt(i) == vowel) {
                    vowelsCount++;
                }
            }
        }

        // your code here
        return vowelsCount;
    }
}
