package com.company;

public class Ora {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54AM"));
    }

    public static String timeConversion(String s) {
        // Write your code here
        String[] split = s.split(":");
        int num = Integer.parseInt(split[0]);
//        if (s.contains("PM")) {
//            return (12 + num) + s.substring(2, 8);
////            return s.substring(0, 8);
//        } else if (num == 12 && s.contains("AM")) {
//            return "00"+s.substring(2, 8);
//        } else
//            return s.substring(0, 8);


        if (s.contains("AM") && num != 12) {
            return s.substring(0, 8);
        } else if (s.contains("AM") && num == 12) {
            return "00" + s.substring(2, 8);
        } else if (s.contains("PM") && num != 12) {
            return (12 + num) + s.substring(2, 8);
        } else
            return s.substring(0, 8);
    }
}
