package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length < 3)
            return Arrays.stream(nums).max().getAsInt();

        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (int num : nums) {
            if (firstMax != null && num == firstMax ||
                    secondMax != null && num == secondMax ||
                    thirdMax != null && num == thirdMax)
                continue;

            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        return thirdMax == null ? firstMax : thirdMax;
    }
}