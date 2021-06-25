package com.company;

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey wollef sroirraw"));
    }

    /**
     * Write a function that takes in a string of one or more words,
     * and returns the same string, but with all five or more letter words reversed
     * (like the name of this kata).
     * Strings passed in will consist of only letters and spaces.
     * Spaces will be included only when more than one word is present.
     */
    public static String spinWords(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            if (word.length() < 5) {
                stringBuilder.append(word).append(" ");
            } else {
                for (int i = word.length() - 1; i >= 0; i--) {
                    stringBuilder.append(word.charAt(i));
                    if (i == 0) {
                        stringBuilder.append(" ");
                    }
                }
            }
//            System.out.print(stringBuilder);
        }
        return stringBuilder.toString().substring(0, stringBuilder.toString().length() - 1);
    }
}
