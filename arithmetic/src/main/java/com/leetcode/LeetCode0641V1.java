package com.leetcode;

import com.leetcode.entity.DListNode;

/**
 * 0641--[设计循环双端队列]
 * 链表实现
 * @author lizhenyu
 * @date 2021/8/9
 */
public class LeetCode0641V1 {

    /**
     * 头结点
     */
    private DListNode head;
    /**
     * 尾结点
     */
    private DListNode tail;
    /**
     * 队列支持大小
     */
    private int size;
    /**
     * 队列长度
     */
    private int length;

    /**
     * 构造函数，队列大小
     * @param k 队列大小
     */
    public LeetCode0641V1(int k) {
        length = 0;
        size = k;
    }

    /**
     * 将一个元素添加到双端队列头部。 如果操作成功返回 true。
     * @param value 要添加的元素
     * @return 添加结果
     */
    public boolean insertFront(int value) {
        // 队列已满
        if (isFull()) {
            return false;
        }
        DListNode node = new DListNode(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head.pre = node;
            head = node;
        }
        length++;
        return true;
    }

    /**
     * 将一个元素添加到双端队列尾部。如果操作成功返回 true。
     * @param value 要添加的元素
     * @return 添加结果
     */
    public boolean insertLast(int value) {
        // 队列已满
        if (isFull()) {
            return false;
        }
        DListNode node = new DListNode(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            node.pre = tail;
            tail = node;
        }
        length++;
        return true;
    }

    /**
     * 从双端队列头部删除一个元素。 如果操作成功返回 true。
     * @return 删除是否成功
     */
    public boolean deleteFront() {
        // 队列已空
        if (isEmpty()) {
            return false;
        }

        if (head.equals(tail)) {
            head = tail = null;
        } else {
            DListNode next = head.next;
            next.pre = null;
            head.next = null;
            head = next;
        }
        length--;
        return true;
    }

    /**
     * 从双端队列尾部删除一个元素。如果操作成功返回 true。
     * @return 删除是否成功
     */
    public boolean deleteLast() {
        // 队列已空
        if (isEmpty()) {
            return false;
        }

        if (head.equals(tail)) {
            head = tail = null;
        } else {
            DListNode pre = tail.pre;
            pre.next = null;
            tail.pre = null;
            tail = pre;
        }
        length--;
        return true;
    }

    /**
     * 从双端队列头部获得一个元素。如果双端队列为空，返回 -1。
     * @return 获取头部元素
     */
    public int getFront() {
        // 队列已空
        if (isEmpty()) {
            return -1;
        }
        return head.val;
    }

    /**
     * 获得双端队列的最后一个元素。 如果双端队列为空，返回 -1。
     * @return 获取尾部元素
     */
    public int getRear() {
        // 队列已空
        if (isEmpty()) {
            return -1;
        }
        return tail.val;
    }

    /**
     * 检查双端队列是否为空。
     * @return 队列是否为空
     */
    public boolean isEmpty() {
        return length == 0;
    }

    /**
     * 检查双端队列是否满了。
     * @return 队列是否已满
     */
    public boolean isFull() {
        return size == length;
    }
}
