package com.structure;

import org.junit.Test;
import structure.CircleQueue;

/**
 * 循环队列测试类
 * @author lizhenyu
 * @date 2021/7/13
 */
public class CircleQueueTest {

    /**
     * 测试队列已满的情况入队
     */
    @Test
    public void testFullEnqueue() {
        CircleQueue<Integer> queue = new CircleQueue<>(3);
        System.out.println(queue.enqueue(1));
        System.out.println(queue.enqueue(2));
        System.out.println(queue.enqueue(3));
        System.out.println(queue.toString());
    }

    /**
     * 测试队列为空的情况出队
     */
    @Test
    public void testEmptyDequeue() {
        CircleQueue<Integer> queue = new CircleQueue<>(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());
    }

    /**
     * 测试队列操作
     */
    @Test
    public void testQueue() {
        CircleQueue<String> queue = new CircleQueue<>(4);
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        System.out.println(queue.dequeue());
        queue.enqueue("d");
        System.out.println(queue.toString());
    }
}
