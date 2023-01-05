package com.leetcode.task13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void romanToInt1() {
        String input = "III";
        int expected = 3;
        int actual = romanToInteger.romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    void romanToInt2() {
        String input = "LVIII";
        int expected = 58;
        int actual = romanToInteger.romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    void romanToInt3() {
        String input = "MCMXCIV";
        int expected = 1994;
        int actual = romanToInteger.romanToInt(input);
        assertEquals(expected, actual);
    }
}
