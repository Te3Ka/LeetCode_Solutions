package ru.te3ka.exercisesleetcode;

public class Solution {
    public int findNumbers(int[] nums) {
        int countEvenNumbers = 0;

        for (int num : nums) {
            int countDivided = 0;
            while (num > 0) {
                countDivided++;
                num /= 10;
            }
            if (countDivided % 2 == 0)
                countEvenNumbers++;
        }
        return countEvenNumbers;
    }
}
