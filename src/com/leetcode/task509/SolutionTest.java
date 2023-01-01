package com.leetcode.task509;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();
    @Test
    void fibTest1() {
        int input = 2;
        int expected = 1;
        int actual = solution.fib(input);
        assertEquals(expected, actual);
    }

    @Test
    void fibTest2() {
        int input = 3;
        int expected = 2;
        int actual = solution.fib(input);
        assertEquals(expected, actual);
    }

    @Test
    void fibTest3() {
        int input = 4;
        int expected = 3;
        int actual = solution.fib(input);
        assertEquals(expected, actual);
    }
}
