package ru.te3ka.exercisesleetcode;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind = m + n - 1;
        while (m >= 1 && n >= 1) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[ind] = nums1[m - 1];
                m--;
            } else {
                nums1[ind] = nums2[n - 1];
                n--;
            }
            ind--;
        }

        while (n >= 1) {
            nums1[ind] = nums2[n - 1];
            n--;
            ind--;
        }
    }
}
