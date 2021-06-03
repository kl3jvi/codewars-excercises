package com.company;

import java.util.ArrayList;
import java.util.List;

public class Smile {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":)");
        a.add("x-]");
        a.add(":ox");
        a.add(";-(");
        a.add(";-)");
        a.add(";~(");
        a.add(":~D");


        System.out.println(countSmileys(a));

    }

    public static int countSmileys(List<String> arr) {
        // Just Smile :)
        int counter = 0;
        for (String s : arr) {
            if (s.endsWith(")") || s.endsWith(":D") || s.endsWith("-D") || s.endsWith("~D") || s.endsWith("~)")) {
                ++counter;
            }
        }
        return counter;
    }
}
