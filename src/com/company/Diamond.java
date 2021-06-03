package com.company;

public class Diamond {
    public static void main(String[] args) {
        System.out.println(print(3));
    }

    public static String print(int n) {
        // TODO your code here
        if(n%2==0 || n<0){
            return null;
        } else {

            for (int i = 0; i < n; i++) {
                for (int j =0; j<i;j++){
                    System.out.println("");
                }
                System.out.println("*");
            }
        }
        return "";
    }
}
