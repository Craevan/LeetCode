package com.leetcode.task1588;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final SolutionV2 solution = new SolutionV2();

    @Test
    void sumOddLengthSubarraysTest1() {
        int[] input = {1, 4, 2, 5, 3};
        int expected = 58;
        int actual = solution.sumOddLengthSubarrays(input);
        assertEquals(expected, actual);
    }

    @Test
    void sumOddLengthSubarraysTest2() {
        int[] input = {1, 2};
        int expected = 3;
        int actual = solution.sumOddLengthSubarrays(input);
        assertEquals(expected, actual);
    }

    @Test
    void sumOddLengthSubarraysTest3() {
        int[] input = {10, 11, 12};
        int expected = 66;
        int actual = solution.sumOddLengthSubarrays(input);
        assertEquals(expected, actual);
    }

    @Test
    void sumOddLengthSubarraysTest4() {
        int[] input = {1, 1, 1, 1, 1, 1};
        int expected = 28;
        int actual = solution.sumOddLengthSubarrays(input);
        assertEquals(expected, actual);
    }
}
