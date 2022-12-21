package com.leetcode.task1822;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void arraySign() {
        int[] array = {-1, -2, -3, -4, 3, 2, 1};
        int expected = 1;
        int actual = solution.arraySign(array);
        assertEquals(expected, actual);
    }

    @Test
    void arraySign2() {
        int[] array = {1, 5, 0, 2, -3};
        int expected = 0;
        int actual = solution.arraySign(array);
        assertEquals(expected, actual);
    }

    @Test
    void arraySign3() {
        int[] array = {-1, 1, -1, 1, -1};
        int expected = -1;
        int actual = solution.arraySign(array);
        assertEquals(expected, actual);
    }

    @Test
    void arraySign4() {
        int[] array = {7, 36, 96, 70, 85, 23, 5, 18, 4, 12, 89, 92, 9, 30, 53, 14, 96, 32, 13, 43, 37, 60, 75, 7, 83,
                68, 20, 8, -24, -80, -27, -92, -96, -20, -16, -52, -49, -38};
        int expected = 1;
        int actual = solution.arraySign(array);
        assertEquals(expected, actual);
    }

    @Test
    void arraySign5() {
        int[] array = {9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24};
        int expected = -1;
        int actual = solution.arraySign(array);
        assertEquals(expected, actual);
    }
}
