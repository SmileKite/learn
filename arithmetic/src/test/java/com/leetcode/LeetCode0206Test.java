package com.leetcode;

import com.leetcode.entity.ListNode;
import org.junit.Test;

/**
 * 链表翻转测试类
 * @author lizhenyu
 * @date 2021/7/9
 */
public class LeetCode0206Test {

    /**
     * 测试链表为null的情况
     */
    @Test
    public void testNullV1() {
        LeetCode0206 leetCode0206 = new LeetCode0206();

        ListNode listNode = leetCode0206.reverseListV1(null);
        showListNode(listNode);
    }

    /**
     * 测试链表为null的情况
     */
    @Test
    public void testNullV2() {
        LeetCode0206 leetCode0206 = new LeetCode0206();

        ListNode listNode = leetCode0206.reverseListV2(null);
        showListNode(listNode);
    }

    /**
     * 测试链表为空的情况
     */
    @Test
    public void testEmptyV1() {
        LeetCode0206 leetCode0206 = new LeetCode0206();
        ListNode head = new ListNode();

        ListNode listNode = leetCode0206.reverseListV1(head);
        showListNode(listNode);
    }

    /**
     * 测试链表为空的情况
     */
    @Test
    public void testEmptyV2() {
        LeetCode0206 leetCode0206 = new LeetCode0206();
        ListNode head = new ListNode();

        ListNode listNode = leetCode0206.reverseListV2(head);
        showListNode(listNode);
    }

    /**
     * 测试链表只有头结点的情况
     */
    @Test
    public void testSingleV1() {
        LeetCode0206 leetCode0206 = new LeetCode0206();
        ListNode head = new ListNode(1);

        ListNode listNode = leetCode0206.reverseListV1(head);
        showListNode(listNode);
    }

    /**
     * 测试链表只有头结点的情况
     */
    @Test
    public void testSingleV2() {
        LeetCode0206 leetCode0206 = new LeetCode0206();
        ListNode head = new ListNode(1);

        ListNode listNode = leetCode0206.reverseListV2(head);
        showListNode(listNode);
    }

    /**
     * 测试链表有两个结点的情况
     */
    @Test
    public void testDoubleV1() {
        LeetCode0206 leetCode0206 = new LeetCode0206();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode listNode = leetCode0206.reverseListV1(head);
        showListNode(listNode);
    }

    /**
     * 测试链表有两个结点的情况
     */
    @Test
    public void testDoubleV2() {
        LeetCode0206 leetCode0206 = new LeetCode0206();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode listNode = leetCode0206.reverseListV2(head);
        showListNode(listNode);
    }

    /**
     * 测试链表翻转
     */
    @Test
    public void testCommonV1() {
        LeetCode0206 leetCode0206 = new LeetCode0206();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;


        ListNode listNode = leetCode0206.reverseListV1(head);
        showListNode(listNode);
    }

    /**
     * 测试链表翻转
     */
    @Test
    public void testCommonV2() {
        LeetCode0206 leetCode0206 = new LeetCode0206();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;


        ListNode listNode = leetCode0206.reverseListV2(head);
        showListNode(listNode);
    }

    private void showListNode(ListNode head) {
        ListNode show = head;
        while (show != null) {
            System.out.println(show.val);
            show = show.next;
        }
    }
}
