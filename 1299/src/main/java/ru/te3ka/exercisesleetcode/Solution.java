package ru.te3ka.exercisesleetcode;

public class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int temp = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                arr[i] = temp;
                temp = max;
            } else {
                arr[i] = max;
            }
        }
        return arr;
    }
}
