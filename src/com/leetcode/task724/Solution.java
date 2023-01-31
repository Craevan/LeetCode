package com.leetcode.task724;

public class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int rightSum = 0;
        int leftSum = 0;
        for (int i : nums) {
            rightSum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
