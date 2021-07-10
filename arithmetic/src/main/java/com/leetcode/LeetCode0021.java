package com.leetcode;

import com.leetcode.entity.ListNode;

/**
 * 0021--[合并两个有序链表]
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @author lizhenyu
 * @date 2021/7/9
 */
public class LeetCode0021 {

    /**
     * 合并有序链表（递归解法）
     * @param l1 有序链表1
     * @param l2 有序链表2
     * @return 合并后的有序链表
     */
    public ListNode mergeTwoListsV1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = this.mergeTwoListsV1(l1.next, l2);
            return l1;
        } else {
            l2.next = this.mergeTwoListsV1(l1, l2.next);
            return l2;
        }
    }

    /**
     * 合并有序链表（迭代解法）
     * @param l1 有序链表1
     * @param l2 有序链表2
     * @return 合并后的有序链表
     */
    public ListNode mergeTwoListsV2(ListNode l1, ListNode l2) {
        ListNode merge = new ListNode(-1);
        ListNode curr = merge;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        // 需要注意，当一条链表读完的时候跳出循环，此时需要将另一条链表续上
        curr.next = l1 == null ? l2 : l1;
        return merge.next;
    }
}
