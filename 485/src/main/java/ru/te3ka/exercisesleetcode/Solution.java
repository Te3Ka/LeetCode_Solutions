package ru.te3ka.exercisesleetcode;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countOnes = 0, maxCountOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                countOnes++;
                if (countOnes > maxCountOnes)
                    maxCountOnes = countOnes;
            } else
                countOnes = 0;
        }
        return maxCountOnes;
    }
}
