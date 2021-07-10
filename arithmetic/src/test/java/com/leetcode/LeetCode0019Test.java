package com.leetcode;

import com.leetcode.entity.ListNode;
import org.junit.Test;

/**
 * 删除链表倒数第N个结点测试类
 * @author lizhenyu
 * @date 2021/7/10
 */
public class LeetCode0019Test {

    /**
     * 测试链表只有一个结点的情况
     */
    @Test
    public void testSingle() {
        LeetCode0019 leetCode0019 = new LeetCode0019();

        showListNode(leetCode0019.removeNthFromEnd(new ListNode(1), 1));
    }

    /**
     * 测试删除链表的头结点
     */
    @Test
    public void testCommonDeleteHead() {
        LeetCode0019 leetCode0019 = new LeetCode0019();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        showListNode(leetCode0019.removeNthFromEnd(head, 5));
    }

    /**
     * 测试删除链表的中间结点
     */
    @Test
    public void testCommonDeleteMiddle() {
        LeetCode0019 leetCode0019 = new LeetCode0019();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        showListNode(leetCode0019.removeNthFromEnd(head, 3));
    }

    /**
     * 测试删除链表的尾结点
     */
    @Test
    public void testCommonDeleteEnd() {
        LeetCode0019 leetCode0019 = new LeetCode0019();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        showListNode(leetCode0019.removeNthFromEnd(head, 1));
    }

    private void showListNode(ListNode head) {
        ListNode show = head;
        while (show != null) {
            System.out.println(show.val);
            show = show.next;
        }
    }
}
