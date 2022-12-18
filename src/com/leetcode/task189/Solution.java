package com.leetcode.task189;

public class Solution {

    // Suboptimal solution

    /*
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            innerRotate(nums);
        }
    }

    private void innerRotate(int[] array) {
        int[] tmp = new int[array.length];
        tmp[0] = array[array.length - 1];
        System.arraycopy(array, 0, tmp, 1, array.length - 1);
        System.arraycopy(tmp, 0, array, 0, array.length);
    }
     */

    public void rotate(int[] nums, int k) {
        int[] tmp = new int[nums.length];
        if (k > nums.length) {
            k = k % nums.length;
        }
        System.arraycopy(nums, nums.length - k, tmp, 0, k);
        System.arraycopy(nums, 0, tmp, k, nums.length - k);
        System.arraycopy(tmp, 0, nums, 0, nums.length);
    }
}
