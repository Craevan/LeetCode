package com.leetcode.task1790;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();
    @Test
    void areAlmostEqual() {
        String s1 = "bank";
        String s2 = "kanb";
        boolean expected = true;
        boolean actual = solution.areAlmostEqual(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    void areAlmostEqual2() {
        String s1 = "attack";
        String s2 = "defend";
        boolean expected = false;
        boolean actual = solution.areAlmostEqual(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    void areAlmostEqual3() {
        String s1 = "kelb";
        String s2 = "kelb";
        boolean expected = true;
        boolean actual = solution.areAlmostEqual(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    void areAlmostEqual4() {
        String s1 = "aa";
        String s2 = "ac";
        boolean expected = false;
        boolean actual = solution.areAlmostEqual(s1, s2);
        assertEquals(expected, actual);
    }
}