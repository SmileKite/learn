package com.leetcode;

import com.leetcode.entity.ListNode;

/**
 * 0023--[合并K个升序链表]
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 * @author lizhenyu
 * @date 2021/7/10
 */
public class LeetCode0023 {

    /**
     * 逐个递归合并
     * @param lists 要合并的链表数组
     * @return 合并后的链表
     */
    public ListNode mergeKListsV1(ListNode[] lists) {
        ListNode result = null;
        for (ListNode listNode : lists) {
            result = mergeLists(result, listNode);
        }
        return result;
    }

    /**
     * 分治递归合并
     * @param lists 要合并的链表数组
     * @return 合并后的有序链表
     */
    public ListNode mergeKListsV2(ListNode[] lists) {
        return mergeKListsV2(lists, 0, lists.length-1);
    }

    /**
     * 合并有序链表
     * @param lists 有序链表
     * @param s 起始下标
     * @param e 终止下标
     * @return 合并后的有序链表
     */
    private ListNode mergeKListsV2(ListNode[] lists, int s, int e) {
        if (s == e) {
            return lists[s];
        } else if (s > e) {
            return null;
        }
        return mergeLists(mergeKListsV2(lists, s, (s+e)/2), mergeKListsV2(lists,(s+e)/2+1, e));
    }

    /**
     * 合并两个有序链表
     * @param first 有序链表1
     * @param two 有序链表2
     * @return 合并后的有序链表
     */
    private ListNode mergeLists(ListNode first, ListNode two) {
        if (first == null) {
            return two;
        } else if (two == null) {
            return first;
        }
        if (first.val < two.val) {
            first.next = mergeLists(first.next, two);
            return first;
        } else {
            two.next = mergeLists(first, two.next);
            return two;
        }
    }
}
