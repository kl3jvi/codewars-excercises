package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class MapExamples {
    private static final String IP_CMD = "ip nei s to 0/0";

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        try {
            String[] lines;
            String[] words;
            Process process = Runtime.getRuntime().exec(IP_CMD);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder result = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                result.append(line).append("\n");
            }

            lines = result.toString().split("\n");
            for (String entry : lines) {
                words = entry.split("\\s");
                if (words.length >= 6) {
                    map.put(words[0], words[4]);
                    System.out.println(map.get(words[0]));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
