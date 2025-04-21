package ru.te3ka.exercisesleetcode;


import java.util.Arrays;

public class Main283 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {0};
        int[] nums = {1, 0};

        System.out.println(Arrays.toString(nums));
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}