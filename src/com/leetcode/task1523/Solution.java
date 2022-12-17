package com.leetcode.task1523;

public class Solution {
    public int countOdds(int low, int high) {
//        int counter = 0;
//        for (int i = low; i <= high; i++) {
//            if (i % 2 != 0) {
//                counter++;
//            }
//        }
//        return counter;
        if (low % 2 == 0) {
            ++low;
        }
        if (high % 2 == 0) {
            --high;
        }
        return ((high - low) / 2) + 1;
    }
}
