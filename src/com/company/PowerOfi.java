package com.company;

public class PowerOfi {
    public static void main(String[] args) {
        pofi(5);
        System.out.println(0 % 4);
    }

    public static String pofi(int n) {
        int mode = n % 4;
        switch (mode) {
            case 0:
                return "1";
            case 1:
                return "i";
            case 2:
                return "-1";
            case 3:
                return "-i";
        }
        return "i";
    }
}
