package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Main1089 {
    public static void main(String[] args) {
//        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] nums = {9, 0, 0, 3, 3, 4, 5, 0};
//        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
//        int[] nums = {1, 2, 3};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(nums));
        solution.duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}