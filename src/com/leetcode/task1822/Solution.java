package com.leetcode.task1822;

public class Solution {
    public int arraySign(int[] nums) {
        int countOfNegativeNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                ++countOfNegativeNumbers;
            }
        }
        return countOfNegativeNumbers % 2 == 0? 1 : -1;
    }
}
