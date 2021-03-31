package com.company;

public class Main {

    /**
     * Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
     * <p>
     * For example,
     * <p>
     * [true,  true,  true,  false,
     * true,  true,  true,  true ,
     * true,  false, true,  false,
     * true,  false, false, true ,
     * true,  true,  true,  true ,
     * false, false, true,  true]
     * <p>
     * The correct answer would be 17.
     * <p>
     * Hint: Don't forget to check for bad values like null/undefined
     */
    public static void main(String[] args) {
        // Test 1
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, null, true ,
                true,  true,  true,  true ,
                false, false, true,  true };


        System.out.println(countSheeps(array1));
    }

    public static int countSheeps(Boolean[] arr) {
        int counter = 0;
        for (Boolean present : arr) {
            if (present != null && present) {
                counter += 1;
            }
        }
        return counter;
    }
}
