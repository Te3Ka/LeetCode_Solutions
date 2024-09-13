package ru.te3ka.exercisesleetcode;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};
//        int[] nums = {1,1,1,1,1};
        int[] nums = {3,1,2,10,1};
        Solution solution = new Solution();
        solution.runningSum(nums);
        System.out.print("[");
        for (int num : nums) {
            System.out.print(" " + num);
        }
        System.out.println(" ]");
    }
}