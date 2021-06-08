package com.company;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMerger {
    public static void main(String[] args) {
        System.out.println(validParentheses(""));
        try {
            ByteBuffer.allocate(Integer.BYTES)
                    .put(InetAddress.getByName("0.0.1.0").getAddress())
                    .getInt(0);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static boolean validParentheses(String parens) {
        //Put code below
        int counter = 0;
        for (int i = 0; i < parens.length(); i++) {
            counter += parens.charAt(i);
        }
        return counter % 2 != 0;
    }

}
