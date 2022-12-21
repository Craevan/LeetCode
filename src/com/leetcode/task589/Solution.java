package com.leetcode.task589;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        List<Integer> outputArray = new LinkedList<>();
        if (root == null) {
            return outputArray;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            outputArray.add(node.val);
            Collections.reverse(node.children);
            stack.addAll(node.children);
        }
        return outputArray;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
