package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Main941 {
    public static void main(String[] args) {
//        int[] arr = {0, 2, 3, 4, 5, 2, 1, 0};
        int[] arr = {0,0, 3, 2, 1};

        System.out.println(Arrays.toString(arr));

        Solution solution = new Solution();
        System.out.println(solution.validMountainArray(arr));
    }
}