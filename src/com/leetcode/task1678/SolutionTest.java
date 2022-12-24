package com.leetcode.task1678;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();
    @Test
    void interpretTest1() {
        String input = "G()(al)";
        String expected = "Goal";
        String actual = solution.interpret(input);
        boolean actualResult = expected.equals(actual);
        assertTrue(actualResult);
    }

    @Test
    void interpretTest2() {
        String input = "(al)G(al)()()G";
        String expected = "alGalooG";
        String actual = solution.interpret(input);
        boolean actualResult = expected.equals(actual);
        assertTrue(actualResult);
    }

    @Test
    void interpretTest3() {
        String input = "G()()()()(al)";
        String expected = "Gooooal";
        String actual = solution.interpret(input);
        boolean actualResult = expected.equals(actual);
        assertTrue(actualResult);
    }
}