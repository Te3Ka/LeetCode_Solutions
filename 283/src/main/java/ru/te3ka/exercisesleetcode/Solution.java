package ru.te3ka.exercisesleetcode;

public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1)
            return;

        int zeroPosition = -1;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && zeroPosition == -1) {
                zeroPosition = i;
            }
            if (nums[i] != 0 && nums[zeroPosition] == 0) {
                temp = nums[i];
                nums[i] = nums[zeroPosition];
                nums[zeroPosition] = temp;
                i = zeroPosition;
                zeroPosition = -1;
            }
        }
        return;
    }
}
