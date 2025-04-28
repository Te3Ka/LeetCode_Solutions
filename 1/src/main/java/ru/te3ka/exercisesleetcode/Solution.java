package ru.te3ka.exercisesleetcode;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returns = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    returns[0] = i;
                    returns[1] = j;
                    return returns;
                }
            }
        }
        return returns;
    }
}
