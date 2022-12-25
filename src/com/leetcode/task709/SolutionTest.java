package com.leetcode.task709;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();
    @Test
    void toLowerCaseTest1() {
        String input = "Hello";
        String expected = "hello";
        String actual = solution.toLowerCase(input);
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void toLowerCaseTest2() {
        String input = "here";
        String expected = "here";
        String actual = solution.toLowerCase(input);
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void toLowerCaseTest3() {
        String input = "LOVELY";
        String expected = "lovely";
        String actual = solution.toLowerCase(input);
        assertThat(expected).isEqualTo(actual);
    }
}