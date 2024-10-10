package ru.te3ka.exercisesleetcode;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        int temp = 0;
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 1; i < nums.length - j; i++) {
                if (nums[i] < nums[i - 1]) {
                    temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                }
            }
        }
        return nums;
    }
}
