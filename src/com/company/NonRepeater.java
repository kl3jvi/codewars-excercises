package com.company;

public class NonRepeater {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        StringBuilder third = new StringBuilder();
        third.append("-");
        first.append("(");
        for (int i = 0; i < numbers.length; i++) {
            if (i < 3) {
                first.append(numbers[i]);
            } else if (i < 6) {
                second.append(numbers[i]);
            } else third.append(numbers[i]);
        }
        first.append(") ");
        return first.toString() + second + third;
    }
}
