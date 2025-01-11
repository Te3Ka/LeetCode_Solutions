package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Main1346 {
    public static void main(String[] args) {
//        int[] arr = {10, 2, 5, 3};
        int[] arr = {7, 1, 14, 11};

        System.out.println(Arrays.toString(arr));

        Solution solution = new Solution();
        System.out.println(solution.checkIfExist(arr));
    }
}