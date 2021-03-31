package com.company;


public class MaxProduct {
    public static void main(String[] args) {
        int[] test = new int[] {2, 5, 8, 1};
        System.out.println(adjacentElementsProduct(test));
    }

    /**
     * Given an array of integers , Find the maximum product obtained from multiplying 2
     * adjacent numbers in the array.
     * @param array
     * @return
     */
        public static int adjacentElementsProduct(int[] array) {
            // your code here
            int size =array.length;
            int max = array[0]*array[1];
            for(int i = 0; i<size-1;i++){
                var j = i+1;
                var prod = array[i]*array[j];
                if(prod>max)
                    max = prod;
            }
            return max;
        }

}
