package com.company;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(-569));
    }

    public static int reverse(int num){
        int reversed=0;
        while(num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
