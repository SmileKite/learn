package com.leetcode;

import com.leetcode.entity.ListNode;

/**
 * 0019--[删除链表的倒数第N个结点]
 * 给你一个链表，删除链表的倒数第n个结点，并且返回链表的头结点。
 * 进阶：你能尝试使用一趟扫描实现吗
 * 1<=size
 * 1<=N<=size
 * @author lizhenyu
 * @date 2021/7/10
 */
public class LeetCode0019 {

    /**
     * 删除链表的倒数第N个结点
     * @param head 头结点
     * @param n 结点序号
     * @return 删除后的链表头结点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode pre = head;
        ListNode suf = dummy;
        for (int i = 0; i < n; i++) {
            pre = pre.next;
        }
        while (pre != null) {
            pre = pre.next;
            suf = suf.next;
        }
        suf.next = suf.next.next;
        return dummy.next;
    }

}
