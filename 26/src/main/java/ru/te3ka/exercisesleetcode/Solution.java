package ru.te3ka.exercisesleetcode;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int val = -101;

        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[j] = nums[i];
                val = nums[j];
                j++;
            }
        }

        for (int i = j; i < nums.length; i++)
            nums[i] = 101;

        return j;
    }
}
