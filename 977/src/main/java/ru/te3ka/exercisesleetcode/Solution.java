package ru.te3ka.exercisesleetcode;

public class Solution {
    /**
     * Решение через возведение в квадрат и сортировку пузырьком.
     *
     * @param nums
     * @return
     */
    public int[] sortedSquaresViaNewArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        int temp = 0;
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 1; i < nums.length - j; i++) {
                if (nums[i] < nums[i - 1]) {
                    temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                }
            }
        }
        return nums;
    }

    /**
     * Решение через сравнение квадратов элементов.
     *
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int mainIndex = nums.length - 1;

        while (leftIndex <= rightIndex) {
            int leftSquare = nums[leftIndex] * nums[leftIndex];
            int rightSquare = nums[rightIndex] * nums[rightIndex];

            if (leftSquare > rightSquare) {
                result[mainIndex] = leftSquare;
                leftIndex++;
            } else {
                result[mainIndex] = rightSquare;
                rightIndex--;
            }
            mainIndex--;
        }

        return result;
    }
}
