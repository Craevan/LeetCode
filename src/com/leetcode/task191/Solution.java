package com.leetcode.task191;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String bytes = Integer.toBinaryString(n);
        int counter = 0;
        for (int i = 0; i < bytes.length(); i++) {
            if (bytes.charAt(i) == '1') {
                counter++;
            }
        }
        return counter;
    }
}
