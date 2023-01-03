package com.leetcode.task198;

public class Solution {

    public int rob(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (i == 1) {
                nums[i] = Math.max(nums[i], nums[i - 1]);
            } else {
                nums[i] = Math.max(nums[i] + nums[i - 2], nums[i - 1]);
            }
        }
        return nums[nums.length - 1];
    }
}
