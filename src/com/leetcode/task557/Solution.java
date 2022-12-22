package com.leetcode.task557;

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result = result.concat(reverseWord(words[i]));
            result = result.concat(" ");
        }
        return result.trim();
    }

    private String reverseWord(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }
        return new String(chars);
    }
}
