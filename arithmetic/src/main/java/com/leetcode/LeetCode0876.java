package com.leetcode;

import com.leetcode.entity.ListNode;

/**
 * 0876--[链表的中间结点]
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 * 给定链表的结点数介于 1 和 100 之间。
 * @author lizhenyu
 * @date 2021/7/10
 */
public class LeetCode0876 {

    /**
     * 获取链表的中间结点
     * @param head 链表的头结点
     * @return 链表的中间结点
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
