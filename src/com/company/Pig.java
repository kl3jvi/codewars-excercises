package com.company;

public class Pig {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool !"));
    }

    public static String pigIt(String str) {
        // Write code here
        String[] ndarje = str.split(" ");
        StringBuilder result = new StringBuilder();
        String punct = "";
        for (String ndar : ndarje) {
            if (ndar.matches(".*\\p{Punct}")) {
                punct = " "+ndar;
            }else if (ndar.length() > 1) {
                result.append(ndar.substring(1)).append(ndar.charAt(0)).append("ay ");
            } else {
                result.append(ndar.charAt(0)).append("ay ");
            }

        }
        return result.substring(0,result.length()-1) + punct;
    }
}
