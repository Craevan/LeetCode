package com.leetcode.task35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int firstIndex = 0;
        int lastIndex = nums.length - 1;
        while (firstIndex <= lastIndex) {
            int middle = (lastIndex + firstIndex) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                lastIndex = middle - 1;
            } else if (nums[middle] < target) {
                firstIndex = middle + 1;
            }
        }
        return ++lastIndex;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 3, 5, 6};
        System.out.println(sol.searchInsert(nums, 0));
    }
}
