package com.leetcode.task1309;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();
    @Test
    void freqAlphabetsTest1() {
        String actual = solution.freqAlphabets("10#11#12");
        String expected = "jkab";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void freqAlphabetsTest2() {
        String actual = solution.freqAlphabets("1326#");
        String expected = "acz";
        assertThat(actual).isEqualTo(expected);
    }
}
