package com.leetcode;

import com.leetcode.entity.ListNode;
import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/28
 */
public class LeetCode0725Test {

    @Test
    public void test() {
        LeetCode0725 leetCode0725 = new LeetCode0725();

        show(leetCode0725.splitListToParts(merge(new int[] {1, 2, 3}), 5));
        show(leetCode0725.splitListToParts(merge(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}), 3));
    }

    private ListNode merge(int[] nums) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        for (int num : nums) {
            ListNode a = new ListNode(num);
            temp.next = a;
            temp = temp.next;
        }
        return head.next;
    }

    private void show(ListNode[] nodes) {
        for (ListNode node : nodes) {
            while (node != null) {
                System.out.print(node.val+ " ");
                node = node.next;
            }
            System.out.println();
        }
    }
}
