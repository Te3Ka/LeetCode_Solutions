package ru.te3ka.exercisesleetcode;

public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1)
            return;

        int lastNonZeroElement = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[lastNonZeroElement];
                nums[lastNonZeroElement] = temp;
                lastNonZeroElement++;
            }
        }
    }
}
