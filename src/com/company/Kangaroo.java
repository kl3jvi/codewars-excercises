package com.company;

public class Kangaroo {

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        for (int i = 0; i < 10000; i++) {
            x1 += v1;
            x2 += v2;
            if(x1==x2){
                return "YES";
            }
        }
        return "NO";
    }
}
