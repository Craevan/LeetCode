package com.leetcode.task217;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void containsDuplicate() {
        int[] testInput = {1, 2, 3, 1};
        boolean actual = solution.containsDuplicate(testInput);
        assertTrue(actual);
    }

    @Test
    void containsDuplicate1() {
        int[] testInput = {1, 2, 3, 4};
        boolean actual = solution.containsDuplicate(testInput);
        assertFalse(actual);
    }

    @Test
    void containsDuplicate2() {
        int[] testInput = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean actual = solution.containsDuplicate(testInput);
        assertTrue(actual);
    }
}
