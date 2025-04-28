package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,7,11,15};
        int target = 18;

        System.out.println(Arrays.toString(nums));
        System.out.println("target = " + target);

        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}