package com.leetcode.task496;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int index = findIndex(nums1[i], nums2);
            for (int j = index; j < nums2.length; j++) {
                if (nums2[index] < nums2[j]) {
                    result[i] = nums2[j];
                    break;
                }
                if (j == nums2.length - 1) {
                    result[i] = -1;
                }
            }
        }
        return result;
    }

    private int findIndex(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
