package com.leetcode.task557;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void reverseWordsTest1() {
        String input = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";
        String actual = solution.reverseWords(input);
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsTest2() {
        String input = "God Ding";
        String expected = "doG gniD";
        String actual = solution.reverseWords(input);
        assertEquals(expected, actual);
    }
}