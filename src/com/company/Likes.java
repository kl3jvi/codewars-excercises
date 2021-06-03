package com.company;

public class Likes {
    public static void main(String[] args) {
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    public static String whoLikesIt(String... names) {
        //Do your magic here
        int length = names.length;
        if (names.length == 0) {
            return "no one likes this";
        } else if (length == 1) {
            return names[0] + " likes this";
        } else if (length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (length == 3) {
            return names[0] + ", " + names[1] + " and " + "like this";
        } else return names[0] + ", " + names[1] + " and " + (length - 2) + " others like this";
    }
}
