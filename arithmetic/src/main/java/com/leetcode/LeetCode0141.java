package com.leetcode;

import com.leetcode.entity.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 0141--[环形链表]
 * 给定一个链表，判断链表中是否有环。
 * @author lizhenyu
 * @date 2021/7/9
 */
public class LeetCode0141 {

    /**
     * 链表环检测（hash表）
     * @param head 链表头结点
     * @return 是否有环
     */
    public boolean hasCycleV1(ListNode head) {
        ListNode curr = head;
        Set nodes = new HashSet();
        while (curr != null) {
            if (!nodes.add(curr)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    /**
     * 链表环检测（快慢指针）
     * @param head 链表头结点
     * @return 是否有环
     */
    public boolean hasCycleV2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
