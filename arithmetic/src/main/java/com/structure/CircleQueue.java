package com.structure;

/**
 * 循环队列
 * @author lizhenyu
 * @date 2021/7/13
 */
public class CircleQueue<T> {

    /** 数组 */
    private Object[] items;
    /** 队列头下标 */
    private int head;
    /** 队列尾下标*/
    private int tail;
    /** 栈大小 */
    private int size;

    public CircleQueue(int size) {
        this.size = size;
        items = new Object[size];
    }

    /**
     * 入队
     * @param t 入队元素
     * @return 是否成功
     */
    public boolean enqueue(T t) {
        // 队列已满的判断
        if ((tail+1)%size == head) {
            return false;
        }
        this.items[tail] = t;
        tail = (tail+1)%size;
        return true;
    }

    /**
     * 出队
     * @return 出队元素
     */
    public T dequeue() {
        // 队列为空的判断
        if (tail == head) {
            return null;
        }
        T val = (T) this.items[head];
        head = (head+1)%size;
        return val;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = head; i != tail; i=(i+1)%size) {
            builder.append(", ").append(this.items[i].toString());
        }
        return builder.append("]").toString().replaceFirst(", ", "");
    }
}
