package com.company;

import java.util.Arrays;

public class MatrixCenter {
    public static void main(String[] args) {
        int[][] test = new int[][]{{5, 1, 3}, {6, 2, 6}, {7, 4, 5}};
        System.out.println(center(test));

    }

    public static Integer center(int[][] matrix) {
        for (int i = 0, l = matrix.length; i < l; i++) {
            if (matrix[i].length != l) {

                    System.out.println(matrix[((matrix.length / 2) + 1)][(matrix.length / 2) + 1]);

            }
        }
        return -1;
    }
}
