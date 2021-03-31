package com.company;

public class FindDivisor {
    public static void main(String[] args) {
        System.out.println(numberOfDivisors(30));
    }

    /**
     * Count the number of divisors of a positive integer n.
     *
     * Random tests go up to n = 500000.
     *
     * @param n
     * @return
     */
    public static long numberOfDivisors(int n) {
        var counter =0;
        for(var i =1; i<=n;i++){
            if(n%i == 0)
                counter++;
        }
        return counter;
    }

}
