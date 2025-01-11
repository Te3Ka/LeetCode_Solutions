package ru.te3ka.exercisesleetcode;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean isExist = false;

        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < j; i++) {
                if (arr[i] == 2 * arr[j] || 2 * arr[i] == arr[j]) {
                    isExist = true;
                    break;
                }
            }
            if (isExist)
                break;
        }

        return isExist;
    }
}
