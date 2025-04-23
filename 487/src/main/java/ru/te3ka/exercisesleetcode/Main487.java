package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Main487 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,0,1,1,0,1,1,1,0,0,1,1,1,1,1,0,1};

        System.out.println(Arrays.toString(nums));
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
}