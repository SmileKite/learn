package com.structure;

/**
 * @author lizhenyu
 * @date 2021/7/11
 */
public class LinkedStack<T> {

    /** 栈顶元素 */
    private ListNode<T> top = null;

    /**
     * 入栈操作
     * @param t 入栈元素
     */
    public void push(T t) {
        ListNode<T> temp = new ListNode<>(t);
        if (top != null) {
            temp.next = top;
        }
        top = temp;
    }

    /**
     * 出栈操作
     * @return 出栈元素
     */
    public T pop() {
        if (top == null) {
            return null;
        }
        T val = top.t;
        top = top.next;
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
        ListNode<T> curr = this.top;
        while(curr != null) {
            builder.append(", ").append(curr.t.toString());
            curr = curr.next;
        }
        return builder.append("]").toString().replaceFirst(", ", "");
    }
}
