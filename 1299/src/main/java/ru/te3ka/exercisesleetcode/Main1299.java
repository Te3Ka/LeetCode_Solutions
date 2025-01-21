package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Main1299 {
    public static void main(String[] args) {
//        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] arr = {400};

        System.out.println(Arrays.toString(arr));

        Solution solution = new Solution();
        solution.replaceElements(arr);
        System.out.println(Arrays.toString(arr));
    }
}