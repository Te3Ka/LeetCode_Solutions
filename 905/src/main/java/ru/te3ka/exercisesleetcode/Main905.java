package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Main905 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 3, 1, 9, 9, 9, 9, 2, 4, 5, 8, 8, 8, 8, 8, 8, 7};

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(solution.sortArrayByParity(nums)));
    }
}