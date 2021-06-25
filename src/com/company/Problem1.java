package com.company;

import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        myPerm("tat");
        // Expected output "erdii"
    }




    public static void myPerm(String str) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length(); j++) {
                if(j==i){
                    break;
                }else string.append(str.charAt(i));

            }
        }
        System.out.println(string);
    }
}
