package com.leetcode.task392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        if (sLength == 0) {
            return true;
        }
        int anchor = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(anchor) == t.charAt(i)) {
                anchor++;
                if (anchor == sLength) {
                    return true;
                }
            }
        }
        return false;
    }
}
