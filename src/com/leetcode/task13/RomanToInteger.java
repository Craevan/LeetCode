package com.leetcode.task13;

public class RomanToInteger {

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int current;
        int prev = Integer.MAX_VALUE;
        int num = 0;
        for (char ch : chars) {
            current = convert(ch);
            num += current;
            if (prev < current) {
                num = num - (2 * prev);
            }
            prev = current;
        }
        return num;
    }

    private int convert(char c) {
        return switch (Character.toLowerCase(c)) {
            case ('i') -> 1;
            case ('v') -> 5;
            case ('x') -> 10;
            case ('l') -> 50;
            case ('c') -> 100;
            case ('d') -> 500;
            case ('m') -> 1000;
            default -> 0;
        };
    }
}
