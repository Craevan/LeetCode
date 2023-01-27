package com.leetcode.task392;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isSubsequence() {
        String s = "abc";
        String t = "ahbgdc";
        boolean actual = solution.isSubsequence(s, t);
        assertTrue(actual);
    }

    @Test
    void isSubsequence2() {
        String s = "axc";
        String t = "ahbgdc";
        boolean actual = solution.isSubsequence(s, t);
        assertFalse(actual);
    }

    @Test
    void isSubsequence3() {
        String s = "ab";
        String t = "baab";
        boolean actual = solution.isSubsequence(s, t);
        assertTrue(actual);
    }

    @Test
    void isSubsequence4() {
        String s = "twn";
        String t = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxtxxxxxxxxxxxxxxxxxxxxwxxxxxxxxxxxxxxxxxxxxxxxxxn";
        boolean actual = solution.isSubsequence(s, t);
        assertTrue(actual);
    }
}