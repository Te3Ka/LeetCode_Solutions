package ru.te3ka.exercisesleetcode;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res = 0;
        boolean isChanged = false;
        int indChanged = 0;
        for (int i = 0; i < n; i++) {
            isChanged = false;
            for (int j = indChanged; j < m + n; j++) {

                if (nums2[i] < nums1[j]) {
                    res = nums2[i];
                    nums2[i] = nums1[j];
                    nums1[j] = res;
                    if (!isChanged) {
                        indChanged = j;
                        isChanged = true;
                    }
                } else if (nums1[j] == 0) {
                    nums1[j] = nums2[i];
                    nums2[i] = 0;
                    if (!isChanged) {
                        indChanged = j;
                        isChanged = true;
                    }
                    break;
                }
            }
        }

        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
