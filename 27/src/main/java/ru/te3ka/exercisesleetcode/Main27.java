package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Main27 {
    public static void main(String[] args) {
//        int[] nums = {3, 2, 2, 3};
//        int val = 3;

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        Solution solution = new Solution();
        System.out.println(Arrays.toString(nums));
        System.out.println(solution.removeElement(nums, val));
        System.out.println(Arrays.toString(nums));

    }
}