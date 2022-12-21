package com.leetcode.task1790;

public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        int firstPos = -1;
        int secondPos = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                firstPos = i;
                break;
            }
        }
        for (int i = firstPos + 1; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                secondPos = i;
                break;
            }
        }
        if (firstPos == -1 || secondPos == -1) {
            return false;
        }
        char[] s1Chars = s1.toCharArray();
        String swapped = swap(s1Chars, firstPos, secondPos);
        return swapped.equals(s2);
    }

    private String swap(char[] chars, int first, int second) {
        char tmp = chars[first];
        chars[first] = chars[second];
        chars[second] = tmp;
        return new String(chars);
    }
}
