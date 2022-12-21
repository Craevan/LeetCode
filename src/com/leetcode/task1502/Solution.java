package com.leetcode.task1502;

import java.util.Arrays;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length < 3) {
            return true;
        }
        Arrays.sort(arr);
        boolean result = false;
        int difference = arr[0] - arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                int innerDiff = arr[i] - arr[i + 1];
                if (difference != innerDiff) {
                    return false;
                } else {
                    result = true;
                }
            }
        }
        return result;
    }
}
