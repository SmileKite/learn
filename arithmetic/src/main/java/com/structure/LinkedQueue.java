package com.structure;

/**
 * 基于链表实现的队列
 * @author lizhenyu
 * @date 2021/7/12
 */
public class LinkedQueue<T> {

    /** 头结点 */
    private ListNode<T> head;
    /** 尾结点 */
    private ListNode<T> tail;

    /**
     * 入队
     * @param t 入队元素
     */
    public void enqueue(T t) {
        ListNode<T> node = new ListNode<>(t);
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    /**
     * 出队
     * @return 出队元素
     */
    public T dequeue() {
        if (head == null) {
            return null;
        }
        T val = head.t;
        head = head.next;
        if (head.next == null) {
            tail = null;
        }
        return val;
    }

    /**
     * 链表
     * @param <T>
     */
    private static class ListNode<T> {
        private T t;
        private ListNode<T> next;
        public ListNode(T t) {
            this.t = t;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        ListNode<T> curr = this.head;
        while(curr != null) {
            builder.append(", ").append(curr.t.toString());
            curr = curr.next;
        }
        return builder.append("]").toString().replaceFirst(", ", "");
    }
}
