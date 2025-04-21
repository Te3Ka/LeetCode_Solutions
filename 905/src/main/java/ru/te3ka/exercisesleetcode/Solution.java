package ru.te3ka.exercisesleetcode;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int firstNotParityNumIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0 && nums[firstNotParityNumIndex] % 2 == 0) {
                firstNotParityNumIndex = i;
            }
            if (nums[i] % 2 == 0 && nums[firstNotParityNumIndex] % 2 != 0) {
                int temp = nums[firstNotParityNumIndex];
                nums[firstNotParityNumIndex] = nums[i];
                nums[i] = temp;

                i = firstNotParityNumIndex;
            }
        }

        return nums;
    }
}
