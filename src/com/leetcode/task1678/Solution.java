package com.leetcode.task1678;

public class Solution {
    private final StringBuilder sb = new StringBuilder();

    public String interpret(String command) {
        for (int i = 0; i < command.length(); i++) {
            char ch = command.charAt(i);
            if (ch == 'G') {
                sb.append(ch);
            } else if (ch == '(') {
                char next = command.charAt(i + 1);
                if (next == 'a') {
                    sb.append("al");
                    i += 3;
                } else {
                    sb.append("o");
                    i += 1;
                }
            }
        }
        return sb.toString();
    }
}
