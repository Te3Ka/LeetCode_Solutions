package ru.te3ka.exercisesleetcode;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 1;
        boolean isUp = true;
        boolean isDown = false;
        if (i >= arr.length)
            return false;
        while (isUp) {
            if (i + 1 >= arr.length)
                return false;
            if (arr[i] > arr[i - 1] && arr[i] < arr[i + 1])
                i++;
            else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                isUp = false;
                isDown = true;
                i++;
            }
            else
                return false;
        }

        while (isDown) {
            if (i + 1 >= arr.length)
                return true;
            if (arr[i] < arr[i - 1] && arr[i] > arr[i + 1])
                i++;
            else return false;
        }
        return false;
    }
}
