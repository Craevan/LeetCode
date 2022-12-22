package com.leetcode.task1588;

import java.util.Arrays;

public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        if (arr.length == 3) {
            return sum(arr) * 2;
        }
        int result = 0;
        if (arr.length % 2 == 0) {
            int maxLen = arr.length - 1;
            while (maxLen > 0) {
                for (int i = 0; i <= arr.length - maxLen; i++) {
                    result += sum(Arrays.copyOfRange(arr, i, maxLen + i));
                }
                maxLen -= 2;
            }
        } else {
            int maxLen = arr.length;
            while (maxLen > 0) {
                for (int i = 0; i <= arr.length - maxLen; i++) {
                    result += sum(Arrays.copyOfRange(arr, i, maxLen + i));
                }
                maxLen -= 2;
            }
        }
        return result;
    }

    private int sum(int[] array) {
        int result = 0;
        for (int j : array) {
            result += j;
        }
        return result;
    }
}
