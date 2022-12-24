package com.leetcode.task1768;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();
    @Test
    void mergeAlternatelyTest1() {
        String input1 = "abc";
        String input2 = "pqr";
        String expected = "apbqcr";
        String actual = solution.mergeAlternately(input1, input2);
        boolean result = expected.equals(actual);
        assertTrue(result);
    }

    @Test
    void mergeAlternatelyTest2() {
        String input1 = "ab";
        String input2 = "pqrs";
        String expected = "apbqrs";
        String actual = solution.mergeAlternately(input1, input2);
        boolean result = expected.equals(actual);
        assertTrue(result);
    }
}