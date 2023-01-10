package com.leetcode.task242;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isAnagramTest1() {
        String s = "anagram";
        String t = "nagaram";
        boolean actual = solution.isAnagram(s, t);
        assertTrue(actual);
    }

    @Test
    void isAnagramTest2() {
        String s = "rat";
        String t = "car";
        boolean actual = solution.isAnagram(s, t);
        assertFalse(actual);
    }
}
