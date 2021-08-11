package com.leetcode;

/**
 * 0641--[设计循环双端队列]
 * 循环数组实现
 * @author lizhenyu
 * @date 2021/8/9
 */
public class LeetCode0641V2 {

    /**
     * 队列数组
     */
    private int[] deque;
    /**
     * 头结点下标
     */
    private int head = 0;
    /**
     * 尾结点下标
     */
    private int tail = 0;
    /**
     * 队列支持大小
     */
    private int size;
    /**
     * 队列长度
     */
    private int length = 0;

    /**
     * 构造函数，队列大小
     * @param k 队列大小
     */
    public LeetCode0641V2(int k) {
        size = k;
        deque = new int[k];
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
        head = (head-1+size) % size;
        deque[head] = value;
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
        deque[tail] = value;
        tail = (tail+1)%size;
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
        head = (head+1)%size;
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
        tail = (tail-1+size)%size;
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
        return deque[head];
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
        return deque[(tail-1+size)%size];
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
