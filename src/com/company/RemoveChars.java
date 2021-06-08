package com.company;

public class RemoveChars {
    public static void main(String[] args) {
        System.out.println(remove("klejvi"));
    }
    public static String remove(String str) {

        return str.substring(1,str.length()-1);
    }
}
