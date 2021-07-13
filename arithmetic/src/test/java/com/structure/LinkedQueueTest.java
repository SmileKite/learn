package com.structure;

import org.junit.Test;

/**
 * 基于链表实现的队列测试类
 * @author lizhenyu
 * @date 2021/7/13
 */
public class LinkedQueueTest {

    /**
     * 测试队列为空时的出队
     */
    @Test
    public void testEmptyDequeue() {
        LinkedQueue<String> queue = new LinkedQueue<>();
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());
    }

    /**
     * 测试队列操作
     */
    @Test
    public void testQueue() {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        System.out.println(queue.dequeue());
        queue.enqueue("d");
        System.out.println(queue.toString());
    }

}
