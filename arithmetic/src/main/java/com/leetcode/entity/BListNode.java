package com.leetcode.entity;

/**
 * 扁平化多级双向链表
 * @author lizhenyu
 * @date 2021/9/24
 */
public class BListNode {

    public int val;
    public BListNode prev;
    public BListNode next;
    public BListNode child;

    public BListNode(int val) {
        this.val = val;
    }

}
