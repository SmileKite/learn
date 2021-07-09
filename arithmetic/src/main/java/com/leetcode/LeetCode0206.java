package com.leetcode;

import com.leetcode.entity.ListNode;

/**
 * 给你单链表的头节点head，请你反转链表，并返回反转后的链表。
 * @author lizhenyu
 * @date 2021/7/9
 */
public class LeetCode0206 {

    /**
     * 链表翻转（使用递归）
     * @param head 链表头结点
     * @return 翻转后的链表
     */
    public ListNode reverseListV1(ListNode head) {
        // 判断是否找到了最后一个结点（或者初始化为空的情况）
        if (head == null || head.next == null) {
            return head;
        }
        // 递归翻转
        ListNode lastNode = reverseListV1(head.next);
        head.next.next = head;
        head.next = null;
        return lastNode;
    }

    /**
     * 链表翻转（使用迭代）
     * @param head 链表头结点
     * @return 翻转后的链表
     */
    public ListNode reverseListV2(ListNode head) {
        // 临时存储结点地址，让下一个结点可以找到上一个结点
        ListNode prev = null;
        // 游标，用来标识读到了哪个结点
        ListNode curr = head;
        // 游标为空时证明已经读完了根节点，可以返回新链表的结点
        while (curr != null) {
            // 临时存储next结点地址，防止修改当前结点next指针后丢失next结点
            ListNode temp = curr.next;
            // 翻转两个结点
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

}
