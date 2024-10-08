package ru.te3ka.exercisesleetcode;


public class Main485 {
    public static void main(String[] args) {
//        int[] arrayTest = {1, 1, 0, 0, 1, 1, 1};
        int[] arrayTest = {0, 0, 1, 1, 0, 0, 1};

        Solution solution = new Solution();

        System.out.println(solution.findMaxConsecutiveOnes(arrayTest));
    }
}