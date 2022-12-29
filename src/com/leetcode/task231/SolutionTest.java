package com.leetcode.task231;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();
    @Test
    void isPowerOfTwoTest1() {
        int testInput = 1;
        boolean actual = solution.isPowerOfTwo(testInput);
        assertTrue(actual);
    }

    @Test
    void isPowerOfTwoTest2() {
        int testInput = 1;
        boolean actual = solution.isPowerOfTwo(testInput);
        assertTrue(actual);
    }

    @Test
    void isPowerOfTwoTest3() {
        int testInput = 3;
        boolean actual = solution.isPowerOfTwo(testInput);
        assertFalse(actual);
    }

    @Test
    void isPowerOfTwoTest4() {
        int testInput = 536870912;
        boolean actual = solution.isPowerOfTwo(testInput);
        assertTrue(actual);
    }
}