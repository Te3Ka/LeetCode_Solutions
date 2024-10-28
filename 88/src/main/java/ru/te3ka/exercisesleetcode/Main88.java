package ru.te3ka.exercisesleetcode;

public class Main88 {

    public static void main(String[] args) {
//        nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int m = 3;
        int n = 3;
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

//        nums1 = [4,5,6,0,0,0], m = 3, nums2 = [1,2,3], n = 3
//        int m = 3;
//        int n = 3;
//        int[] nums1 = {4,5,6,0,0,0};
//        int[] nums2 = {1,2,3};

//        nums1 = [1], m = 1, nums2 = [], n = 0
//        int m = 1;
//        int n = 0;
//        int[] nums1 = {1};
//        int[] nums2 = {};

//        nums1 = [0], m = 0, nums2 = [1], n = 1
//        int m = 0;
//        int n = 1;
//        int[] nums1 = {0};
//        int[] nums2 = {1};

//        nums1 = [-1,0,0,3,3,3,0,0,0], m = 6, nums2 = [1,2,2], n = 3
//        int m = 6;
//        int n = 3;
//        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
//        int[] nums2 = {1,2,2};

//        nums1 = [-1,3,0,0,0,0,0], m = 2, nums2 = [0,0,1,2,3], n = 5
//        int m = 2;
//        int n = 5;
//        int[] nums1 = {-1,3,0,0,0,0,0};
//        int[] nums2 = {0,0,1,2,3};

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);

        System.out.println("MAIN");
        System.out.print("nums1 = ");
        for (int i = 0; i < nums1.length; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
        System.out.print("nums2 = ");
        for (int i = 0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");
    }
}
