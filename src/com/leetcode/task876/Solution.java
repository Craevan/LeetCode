package com.leetcode.task876;

class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode next = head;
        if (next.next == null) {
            return head;
        }
        while (next != null) {
            ++size;
            next = next.next;
        }
        next = head;
        for (int i = 0; i < size / 2; i++) {
            next = next.next;
        }
        return next;
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
