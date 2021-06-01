package com.company;

import java.util.Random;

public class PrimeNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int test = random.nextInt(Integer.MAX_VALUE);
        System.out.println(test);
        System.out.println(isPrime(test));
    }

    /**
     * Define a function that takes one integer argument and
     * returns logical value true or false depending on if the
     * integer is a prime.
     *
     * Per Wikipedia, a prime number (or a prime) is a natural
     * number greater than 1 that has no positive divisors other
     * than 1 and itself.
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        boolean flag = false;
        if(num>=2) {
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
        } else return false;

        return !flag;
    }
}
