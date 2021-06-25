package com.company;

public class TimeFormatter {
    public static void main(String[] args) {
     formatDuration(10);
    }

    public static void formatDuration(int n) {
        for (double i = 0; i < n ; i++) {
            for (double j = 0; j < n ; j++) {
                for (double k = 0; k <n; k++) {
                    System.out.println(Math.pow(2,k)*Math.pow(3,i)*Math.pow(5,j));
                }
            }
        }
    }
}
