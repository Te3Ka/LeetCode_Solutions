package ru.te3ka.exercisesleetcode;


import java.util.Arrays;

public class Main448 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(Arrays.toString(nums));
        System.out.println(solution.findDisappearedNumbers(nums));
    }
}