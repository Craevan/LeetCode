package com.leetcode.task344;


public class Solution {
    public void reverseString(char[] s) {
        if (s.length == 0 || s.length == 1) {
            return;
        }
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }
}
