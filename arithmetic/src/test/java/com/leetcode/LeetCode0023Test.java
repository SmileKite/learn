package com.leetcode;

import com.leetcode.entity.ListNode;
import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/7/10
 */
public class LeetCode0023Test {

    public void testEmpty() {

    }

    /**
     * 测试合并有序链表
     */
    @Test
    public void testCommonV1() {
        LeetCode0023 leetCode0023 = new LeetCode0023();

        ListNode[] listNodes = new ListNode[3];
        listNodes[0] = asListNode(new int[]{1, 4, 5});
        listNodes[1] = asListNode(new int[]{1, 3, 4});
        listNodes[2] = asListNode(new int[]{2, 6});

        ListNode listNode = leetCode0023.mergeKListsV1(listNodes);
        showListNode(listNode);
    }

    /**
     * 测试合并有序链表
     */
    @Test
    public void testCommonV2() {
        LeetCode0023 leetCode0023 = new LeetCode0023();

        ListNode[] listNodes = new ListNode[3];
        listNodes[0] = asListNode(new int[]{1, 4, 5});
        listNodes[1] = asListNode(new int[]{1, 3, 4});
        listNodes[2] = asListNode(new int[]{2, 6});

        ListNode listNode = leetCode0023.mergeKListsV2(listNodes);
        showListNode(listNode);
    }

    /**
     * 链表转化
     * @param nums 链表值数组
     * @return 链表头结点
     */
    private ListNode asListNode(int[] nums) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        for (int num : nums) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        return head.next;
    }
    /**
     * 打印链表
     * @param head
     */
    private void showListNode(ListNode head) {
        ListNode show = head;
        while (show != null) {
            System.out.println(show.val);
            show = show.next;
        }
    }

}
