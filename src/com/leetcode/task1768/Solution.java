package com.leetcode.task1768;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        String smaller = word1.length() <= word2.length() ? word1 : word2;
        String bigger = word1.length() > word2.length() ? word1 : word2;
        int position = 0;
        for (int i = 0; i < smaller.length(); i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
            position = i;
        }
        if (word1.length() != word2.length()) {
            sb.append(bigger.substring(position + 1));
        }
        return sb.toString();
    }
}
