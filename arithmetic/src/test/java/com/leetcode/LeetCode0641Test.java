package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/8/9
 */
public class LeetCode0641Test {

    /**
     * 测试循环双端队列
     */
    @Test
    public void testCommonV1() {
        LeetCode0641V1 leetCode0641 = new LeetCode0641V1(3);
        System.out.println(leetCode0641.insertLast(1));
        System.out.println(leetCode0641.insertLast(2));
        System.out.println(leetCode0641.insertFront(3));
        System.out.println(leetCode0641.insertFront(4));
        System.out.println(leetCode0641.getFront());
        System.out.println(leetCode0641.isFull());
        System.out.println(leetCode0641.deleteLast());
        System.out.println(leetCode0641.insertFront(4));
        System.out.println(leetCode0641.getRear());
    }

    /**
     * 测试循环双端队列
     */
    @Test
    public void testCommonV2() {
        LeetCode0641V2 leetCode0641 = new LeetCode0641V2(3);
        System.out.println(leetCode0641.insertLast(1));
        System.out.println(leetCode0641.insertLast(2));
        System.out.println(leetCode0641.insertFront(3));
        System.out.println(leetCode0641.insertFront(4));
        System.out.println(leetCode0641.getFront());
        System.out.println(leetCode0641.isFull());
        System.out.println(leetCode0641.deleteLast());
        System.out.println(leetCode0641.insertFront(4));
        System.out.println(leetCode0641.getRear());
    }

}
