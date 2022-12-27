package com.leetcode.task1290;

class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode iter = head;
        StringBuilder sb = new StringBuilder();
        while (iter != null) {
            sb.append(iter.val);
            iter = iter.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
