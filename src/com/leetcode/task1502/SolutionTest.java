package com.leetcode.task1502;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();
    @Test
    void canMakeArithmeticProgression() {
        int[] array = {3, 5, 1};
        boolean actual = solution.canMakeArithmeticProgression(array);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void canMakeArithmeticProgression1() {
        int[] array = {1, 2, 4};
        boolean actual = solution.canMakeArithmeticProgression(array);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void canMakeArithmeticProgression2() {
        int[] array = {1, 100};
        boolean actual = solution.canMakeArithmeticProgression(array);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}