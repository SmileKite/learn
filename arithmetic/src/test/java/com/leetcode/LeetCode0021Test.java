package com.leetcode;

import com.leetcode.entity.ListNode;
import org.junit.Test;

/**
 * 合并有序链表测试类
 * @author lizhenyu
 * @date 2021/7/9
 */
public class LeetCode0021Test {

    /**
     * 测试两个链表都为null的情况
     */
    @Test
    public void testAllNullV1() {
        LeetCode0021 leetCode0021 = new LeetCode0021();

        ListNode merge = leetCode0021.mergeTwoListsV1(null, null);
        showListNode(merge);
    }

    /**
     * 测试两个链表都为null的情况
     */
    @Test
    public void testAllNullV2() {
        LeetCode0021 leetCode0021 = new LeetCode0021();

        ListNode merge = leetCode0021.mergeTwoListsV2(null, null);
        showListNode(merge);
    }

    /**
     * 测试一个链表为null的情况
     */
    @Test
    public void testSingleNullV1() {
        LeetCode0021 leetCode0021 = new LeetCode0021();

        ListNode merge = leetCode0021.mergeTwoListsV1(null, new ListNode(1));
        showListNode(merge);
    }

    /**
     * 测试两个链表为null的情况
     */
    @Test
    public void testSingleNullV2() {
        LeetCode0021 leetCode0021 = new LeetCode0021();

        ListNode merge = leetCode0021.mergeTwoListsV2(null, new ListNode(1));
        showListNode(merge);
    }

    /**
     * 测试两个链表都只有一个结点的情况
     */
    @Test
    public void testAllSingleV1() {
        LeetCode0021 leetCode0021 = new LeetCode0021();

        ListNode merge = leetCode0021.mergeTwoListsV1(new ListNode(3), new ListNode(1));
        showListNode(merge);
    }

    /**
     * 测试两个链表都只有一个结点的情况
     */
    @Test
    public void testAllSingleV2() {
        LeetCode0021 leetCode0021 = new LeetCode0021();

        ListNode merge = leetCode0021.mergeTwoListsV2(new ListNode(3), new ListNode(1));
        showListNode(merge);
    }

    /**
     * 测试有序链表合并
     */
    @Test
    public void testCommonV1() {
        LeetCode0021 leetCode0021 = new LeetCode0021();

        ListNode head1 = new ListNode(1);
        ListNode two1 = new ListNode(3);
        ListNode three1 = new ListNode(4);
        ListNode four1 = new ListNode(6);
        ListNode five1 = new ListNode(8);
        head1.next = two1;
        two1.next = three1;
        three1.next = four1;
        four1.next = five1;

        ListNode head2 = new ListNode(2);
        ListNode two2 = new ListNode(3);
        ListNode three2 = new ListNode(4);
        ListNode four2 = new ListNode(7);
        ListNode five2 = new ListNode(8);
        head2.next = two2;
        two2.next = three2;
        three2.next = four2;
        four2.next = five2;

        ListNode merge = leetCode0021.mergeTwoListsV1(head1, head2);
        showListNode(merge);
    }

    /**
     * 测试有序链表合并
     */
    @Test
    public void testCommonV2() {
        LeetCode0021 leetCode0021 = new LeetCode0021();

        ListNode head1 = new ListNode(1);
        ListNode two1 = new ListNode(3);
        ListNode three1 = new ListNode(4);
        ListNode four1 = new ListNode(6);
        ListNode five1 = new ListNode(8);
        head1.next = two1;
        two1.next = three1;
        three1.next = four1;
        four1.next = five1;

        ListNode head2 = new ListNode(2);
        ListNode two2 = new ListNode(3);
        ListNode three2 = new ListNode(4);
        ListNode four2 = new ListNode(7);
        ListNode five2 = new ListNode(8);
        head2.next = two2;
        two2.next = three2;
        three2.next = four2;
        four2.next = five2;

        ListNode merge = leetCode0021.mergeTwoListsV2(head1, head2);
        showListNode(merge);
    }

    private void showListNode(ListNode head) {
        ListNode show = head;
        while (show != null) {
            System.out.println(show.val);
            show = show.next;
        }
    }

}
