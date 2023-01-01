package com.leetcode.task509;

import java.util.ArrayList;
import java.util.List;

public class SolutionWithMemo {
    private final List<Integer> CACHE = new ArrayList<>();

    {
        CACHE.add(0);
        CACHE.add(1);
        CACHE.add(1);
    }

    public int fib(int n) {
        if (n < 3) {
            return CACHE.get(n);
        }
        for (int i = 3; i <= n; i++) {
            CACHE.add(CACHE.get(i - 1) + CACHE.get(i - 2));
        }
        return CACHE.get(n);
    }
}
