package com.company;

public class ExclamationMark {
    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("!koot! ckemi !"));
    }
    /**
     * Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
     */
    static String removeExclamationMarks(String s) {
        return s.replace("!","");
    }
}
