package com.leetcode.entity;

/**
 * 双向链表
 * @author lizhenyu
 * @date 2021/8/10
 */
public class DListNode {
    public int val;
    public DListNode pre;
    public DListNode next;
    public DListNode(int val) {
        this.val = val;
    }
}
