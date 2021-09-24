package com.leetcode;

import com.leetcode.entity.BListNode;

/**
 * 0430--[扁平化多级双向链表]
 * 多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。
 * 这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构。
 * 给你位于列表第一级的头节点，请你扁平化列表，使所有结点出现在单级双链表中。
 * @author lizhenyu
 * @date 2021/9/24
 */
public class LeetCode0430 {

    /**
     * 扁平化多级双向链表
     * @param head 原始链表
     * @return 扁平化后的多级双向链表
     */
    public BListNode flatten(BListNode head) {
        dfs(head);
        return head;
    }

    /**
     * 深度优先搜索
     * @param head 链表节点
     * @return 扁平化后的链表
     */
    private BListNode dfs(BListNode head) {
        BListNode cur = head;
        BListNode temp = null;
        while (cur != null) {
            BListNode next = cur.next;
            if (cur.child != null) {
                BListNode dfs = dfs(cur.child);
                cur.next = cur.child;
                cur.next.prev = cur;
                cur.child = null;
                if (next != null) {
                    dfs.next = next;
                    next.prev = dfs;
                }
            } else {
                temp = cur;
            }
            cur = cur.next;
        }
        return temp;
    }
}
