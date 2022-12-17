package com.leetcode.task1523;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution sol = new Solution();

    @Test
    void countOdds() {
        int actual = sol.countOdds(3, 7);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void countOddsWithZero() {
        int actual = sol.countOdds(0, 10);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void countOdds1() {
        int actual = sol.countOdds(8, 10);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void countOdds0() {
        int actual = sol.countOdds(0, 0);
        int expected = 0;
        assertEquals(expected, actual);
    }
}