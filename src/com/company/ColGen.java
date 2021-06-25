package com.company;

import java.util.Random;

public class ColGen {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(generateColor(random));
    }


    public static String generateColor(Random r) {
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        return "#" + digits[r.nextInt(16)] + digits[r.nextInt(16)] + digits[r.nextInt(16)] + digits[r.nextInt(16)] + digits[r.nextInt(16)] + digits[r.nextInt(16)];
    }
}
