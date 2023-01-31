package com.leetcode.task232;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {

    private final Deque<Integer> input = new ArrayDeque<>();
    private final Deque<Integer> output = new ArrayDeque<>();

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty())
            while (!input.isEmpty())
                output.push(input.pop());
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}
