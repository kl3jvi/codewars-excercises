package com.company;

public class AverageClass {
    public static void main(String[] args) {
        System.out.println(getAverage(new int[] {1,2,3,4,5}));
    }
    public static int getAverage(int[] marks){
        int answer=0;
        for (int mark:marks) {
            answer+=mark;
        }
        return answer/marks.length;
    }
}
