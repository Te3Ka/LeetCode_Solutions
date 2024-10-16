package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Main977 {
    public static void main(String[] args) {
//        int[] nums = {-4, -1, 0, 3, 10};
//        int[] nums = {-7, -3, 2, 3, 11};
//        int[] nums = {-7, -3, -2, 3, 11};
        int[] nums = {-30, -11, -10, -7, -3, -2, 3, 11, 15, 29};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(solution.sortedSquaresViaNewArray(nums)));
        System.out.println(Arrays.toString(solution.sortedSquares(nums)));
    }
}