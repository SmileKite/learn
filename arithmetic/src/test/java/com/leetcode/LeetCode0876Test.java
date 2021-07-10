package com.leetcode;

import com.leetcode.entity.ListNode;
import org.junit.Test;

/**
 * 获取链表的中间结点测试类
 * @author lizhenyu
 * @date 2021/7/10
 */
public class LeetCode0876Test {

    /**
     * 测试链表只有一个结点的情况
     */
    @Test
    public void testSingle() {
        LeetCode0876 leetCode0876 = new LeetCode0876();

        ListNode middleNode = leetCode0876.middleNode(new ListNode(1));
        System.out.println(middleNode.val);
    }

    /**
     * 测试链表有两个结点的情况
     */
    @Test
    public void testDouble() {
        LeetCode0876 leetCode0876 = new LeetCode0876();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode middleNode = leetCode0876.middleNode(head);
        System.out.println(middleNode.val);
    }

    /**
     * 测试链表结点数为奇数的情况
     */
    @Test
    public void testOdd() {
        LeetCode0876 leetCode0876 = new LeetCode0876();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ListNode middleNode = leetCode0876.middleNode(head);
        System.out.println(middleNode.val);
    }

    /**
     * 测试链表结点数为偶数的情况
     */
    @Test
    public void testEven() {
        LeetCode0876 leetCode0876 = new LeetCode0876();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        head.next = two;
        two.next = three;
        three.next = four;

        ListNode middleNode = leetCode0876.middleNode(head);
        System.out.println(middleNode.val);
    }
}
