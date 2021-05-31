package com.winwisdom.lintcode.started;

public class _228_LinkedMidpoint {

    public static void main(String[] args) {

    }

    public static ListNode getMidPoint(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode mid = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            mid = mid.next;
            fast = fast.next.next;
        }
        return mid;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }
}