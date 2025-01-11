package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Main26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(nums));
        System.out.println(solution.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}