package com.leetcode.task191;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void hammingWeight() {
        int actual = solution.hammingWeight(521);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void hammingWeight2() {
        int actual = solution.hammingWeight(2097152);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void hammingWeight3() {
        int actual = solution.hammingWeight(-3);
        int expected = 31;
        assertEquals(expected, actual);
    }
}