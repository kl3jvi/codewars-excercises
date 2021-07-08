package com.company;

import java.util.ArrayList;
import java.util.List;

public class GradingStud {
    public static void main(String[] args) {
        System.out.println(gradingStudents(List.of(44)));
        System.out.println(84 % 5);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> retGrd = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade <38 || grade % 5 < 3) {
                retGrd.add(grade);
            } else  {
                retGrd.add(grade + (5-(grade % 5)));
            }
        }
        return retGrd;
    }

}
