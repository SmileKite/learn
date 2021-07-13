package com.structure;

import org.junit.Test;
import structure.ArrayQueue;

/**
 * 基于数组实现的队列测试类
 * @author lizhenyu
 * @date 2021/7/13
 */
public class ArrayQueueTest {

    /**
     * 测试队列已满的情况入队
     */
    @Test
    public void testFullEnqueue() {
        ArrayQueue<String> queue = new ArrayQueue<>(3);
        System.out.println(queue.enqueue("a"));
        System.out.println(queue.enqueue("b"));
        System.out.println(queue.enqueue("c"));
        System.out.println(queue.enqueue("d"));
        System.out.println(queue.toString());
    }

    /**
     * 测试队列已空的情况出队
     */
    @Test
    public void testEmptyDequeue() {
        ArrayQueue<Integer> queue = new ArrayQueue<>(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());
    }

    /**
     * 测试队列操作
     */
    @Test
    public void testQueue() {
        ArrayQueue<String> queue = new ArrayQueue<>(3);
        queue.enqueue("a");
        queue.enqueue("b");
        System.out.println(queue.dequeue());
        queue.enqueue("c");
        queue.enqueue("d");
        System.out.println(queue.toString());
    }

}
