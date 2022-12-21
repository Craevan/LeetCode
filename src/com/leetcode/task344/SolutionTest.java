package com.leetcode.task344;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();
    private final SolutionV2 solution2 = new SolutionV2();

    @Test
    void reverseString() {
        char[] actual = {'h', 'e', 'l', 'l', 'o' };
        solution.reverseString(actual);
        char[] expected = {'o', 'l', 'l', 'e', 'h' };
        assertArrayEquals(expected, actual);
    }

    @Test
    void reverseString2() {
        char[] actual = {'H', 'a', 'n', 'n', 'a', 'h' };
        solution.reverseString(actual);
        char[] expected = {'h', 'a', 'n', 'n', 'a', 'H' };
        assertArrayEquals(expected, actual);
    }

    @Test
    void reverseStringV1() {
        char[] actual = {'h', 'e', 'l', 'l', 'o' };
        solution2.reverseString(actual);
        char[] expected = {'o', 'l', 'l', 'e', 'h' };
        assertArrayEquals(expected, actual);
    }

    @Test
    void reverseStringV2() {
        char[] actual = {'H', 'a', 'n', 'n', 'a', 'h' };
        solution2.reverseString(actual);
        char[] expected = {'h', 'a', 'n', 'n', 'a', 'H' };
        assertArrayEquals(expected, actual);
    }
}