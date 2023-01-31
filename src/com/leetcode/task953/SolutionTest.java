package com.leetcode.task953;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void isAlienSorted1() {
        String[] input = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        boolean actual = solution.isAlienSorted(input, order);
        assertTrue(actual);
    }

    @Test
    void isAlienSorted2() {
        String[] input = {"word", "world", "row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        boolean actual = solution.isAlienSorted(input, order);
        assertFalse(actual);
    }

    @Test
    void isAlienSorted3() {
        String[] input = {"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        boolean actual = solution.isAlienSorted(input, order);
        assertFalse(actual);
    }
}
