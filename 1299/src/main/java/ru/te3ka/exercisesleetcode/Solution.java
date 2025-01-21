package ru.te3ka.exercisesleetcode;

public class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = -1;
                return arr;
            }

            arr[i] = arr[i + 1];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j])
                    arr[i] = arr[j];
            }
        }
        return arr;
    }
}
