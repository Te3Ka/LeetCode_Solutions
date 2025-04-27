package ru.te3ka.exercisesleetcode;


import java.util.Arrays;

public class Main414 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 3,3,4, 2, 1, 5};

        System.out.println(Arrays.toString(nums));
        System.out.println(solution.thirdMax(nums));
    }
}