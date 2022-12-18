package com.leetcode.task1281;

public class Solution {
    public int subtractProductAndSum(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int sum = 0;
        int multipication = 1;
        for (int i = 0; i < digits.length; i++) {
            int digit = Integer.parseInt(String.valueOf(digits[i]));
            sum += digit;
            multipication *= digit;
        }
        return multipication - sum;
    }
}
