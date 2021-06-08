package com.company;

public class TrafficLights {
    public static void main(String[] args) {
        System.out.println(updateLight("orange"));
    }

    public static String updateLight(String current) {
        String[] colors = {"green", "yellow", "red", "green"};
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(current)) {
                return colors[i + 1];
            }
        }
        return "";
    }
}
