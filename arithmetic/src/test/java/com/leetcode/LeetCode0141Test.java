package com.leetcode;

import com.leetcode.entity.ListNode;
import org.junit.Test;

/**
 * 循环链表测试类
 * @author lizhenyu
 * @date 2021/7/9
 */
public class LeetCode0141Test {

    /**
     * 测试链表为null的情况
     */
    @Test
    public void testNullV1() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        System.out.println(leetCode0141.hasCycleV1(null));
    }

    /**
     * 测试链表为null的情况
     */
    @Test
    public void testNullV2() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        System.out.println(leetCode0141.hasCycleV2(null));
    }

    /**
     * 测试链表为empty的情况
     */
    @Test
    public void testEmptyV1() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode();

        System.out.println(leetCode0141.hasCycleV1(head));
    }

    /**
     * 测试链表为empty的情况
     */
    @Test
    public void testEmptyV2() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode();

        System.out.println(leetCode0141.hasCycleV2(head));
    }

    /**
     * 测试链表只有一个结点的情况
     */
    @Test
    public void testSingleV1() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode(1);

        System.out.println(leetCode0141.hasCycleV1(head));
    }

    /**
     * 测试链表只有一个结点的情况
     */
    @Test
    public void testSingleV2() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode(1);

        System.out.println(leetCode0141.hasCycleV2(head));
    }

    /**
     * 测试链表只有两个结点且不为环的情况
     */
    @Test
    public void testNoDoubleV1() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        System.out.println(leetCode0141.hasCycleV1(head));
    }

    /**
     * 测试链表只有两个结点且不为环的情况
     */
    @Test
    public void testNoDoubleV2() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        System.out.println(leetCode0141.hasCycleV2(head));
    }

    /**
     * 测试链表只有两个结点且为环的情况
     */
    @Test
    public void testDoubleV1() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        head.next = two;
        two.next = head;

        System.out.println(leetCode0141.hasCycleV1(head));
    }

    /**
     * 测试链表只有两个结点且为环的情况
     */
    @Test
    public void testDoubleV2() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        head.next = two;
        two.next = head;

        System.out.println(leetCode0141.hasCycleV2(head));
    }

    /**
     * 测试非环链表
     */
    @Test
    public void testNoCommonV1() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(2);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        System.out.println(leetCode0141.hasCycleV1(head));
    }

    /**
     * 测试非环链表
     */
    @Test
    public void testNoCommonV2() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(2);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        System.out.println(leetCode0141.hasCycleV2(head));
    }

    /**
     * 测试首尾相连的环
     */
    @Test
    public void testCommonV1() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(2);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = head;

        System.out.println(leetCode0141.hasCycleV1(head));
    }

    /**
     * 测试首尾相连的环
     */
    @Test
    public void testCommonV2() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(2);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = head;

        System.out.println(leetCode0141.hasCycleV2(head));
    }

    /**
     * 测试中间为环的链表
     */
    @Test
    public void testMiddleV1() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(2);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = three;

        System.out.println(leetCode0141.hasCycleV1(head));
    }

    /**
     * 测试中间为环的链表
     */
    @Test
    public void testMiddleV2() {
        LeetCode0141 leetCode0141 = new LeetCode0141();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(2);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = three;

        System.out.println(leetCode0141.hasCycleV2(head));
    }
}
