package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Solution {
    public void duplicateZeros(int[] arr) {
        int tempOne, tempTwo;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                tempOne = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    tempTwo = arr[j];
                    arr[j] = tempOne;
                    tempOne = tempTwo;
                }
                i++;
            }
        }
    }
}
