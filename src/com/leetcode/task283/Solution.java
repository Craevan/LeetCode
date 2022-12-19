package com.leetcode.task283;

public class Solution {

    public void moveZeroesSecondVar(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

    public void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                trim(nums, i);
                nums[nums.length - 1] = 0;
            }
        }
    }

    private void trim(int[] array, int startPosition) {
        for (int i = startPosition; i < array.length; i++) {
            if (i + 1 < array.length) {
                array[i] = array[i + 1];
            }
        }
    }
}
