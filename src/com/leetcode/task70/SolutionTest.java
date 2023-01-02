package com.leetcode.task70;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void climbStairsTest1() {
        int input = 1;
        int expected = 1;
        int actual = solution.climbStairs(input);
        assertEquals(expected, actual);
    }

    @Test
    void climbStairsTest2() {
        int input = 2;
        int expected = 2;
        int actual = solution.climbStairs(input);
        assertEquals(expected, actual);
    }

    @Test
    void climbStairsTest3() {
        int input = 3;
        int expected = 3;
        int actual = solution.climbStairs(input);
        assertEquals(expected, actual);
    }

    @Test
    void climbStairsTest4() {
        int input = 5;
        int expected = 8;
        int actual = solution.climbStairs(input);
        assertEquals(expected, actual);
    }
}
