package com.leetcode;

import com.leetcode.entity.ListNode;

/**
 * 0725--[分隔链表]
 * 给你一个头结点为 head 的单链表和一个整数 k ，请你设计一个算法将链表分隔为 k 个连续的部分。
 * 每部分的长度应该尽可能的相等：任意两部分的长度差距不能超过 1 。这可能会导致有些部分为 null 。
 * 这 k 个部分应该按照在链表中出现的顺序排列，并且排在前面的部分的长度应该大于或等于排在后面的长度。
 * 返回一个由上述 k 部分组成的数组。
 *      链表中节点的数目在范围 [0, 1000]
 *      0 <= Node.val <= 1000
 *      1 <= k <= 50
 * @author lizhenyu
 * @date 2021/10/28
 */
public class LeetCode0725 {

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];

        ListNode temp = new ListNode(-1, head);
        int length = 0;
        while ((temp = temp.next) != null) {
            length++;
        }

        int over = length % k;
        int len = length / k;
        for (int i = 0; i < k; i++) {
            int offset = i >= over ? len-1 : len;
            result[i] = head;
            for (int j = 0; j < offset; j++) {
                head = head.next;
            }
            if (head == null) {
                continue;
            }
            ListNode c = head;
            head = head.next;
            c.next = null;
        }

        return result;
    }
}
