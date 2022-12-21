package com.leetcode.task202;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void isHappy() {
        int input = 19;
        boolean expected = true;
        boolean actual = solution.isHappy(input);
        assertEquals(expected, actual);
    }

    @Test
    void isHappy2() {
        int input = 2;
        boolean expected = false;
        boolean actual = solution.isHappy(input);
        assertEquals(expected, actual);
    }
}