package com.leetcode.task1480;

public class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = sum(nums, i);
        }
        return result;
    }

    private int sum(int[] array, int index) {
        int result = 0;
        for (int i = 0; i <= index; i++) {
            result += array[i];
        }
        return result;
    }
}
