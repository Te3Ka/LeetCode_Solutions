package ru.te3ka.exercisesleetcode;


import java.util.Arrays;

public class Main1051 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] heights = {1, 1, 4, 2, 1, 3};
//        int[] heights = {5, 1, 2, 3, 4};
        int[] heights = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(heights));
        System.out.println(solution.heightChecker(heights));

    }
}