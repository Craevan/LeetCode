package com.leetcode.task344;

public class SolutionV2 {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder(new String(s));
        sb.reverse();
        System.arraycopy(sb.toString().toCharArray(), 0, s, 0, s.length);
    }
}
