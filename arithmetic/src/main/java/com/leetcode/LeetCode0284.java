package com.leetcode;

import java.util.Iterator;

/**
 * 0284--[窥探迭代器]
 * 请你设计一个迭代器，除了支持 hasNext 和 next 操作外，还支持 peek 操作。
 * 实现 PeekingIterator 类：
 *      PeekingIterator(int[] nums) 使用指定整数数组 nums 初始化迭代器。
 *      int next() 返回数组中的下一个元素，并将指针移动到下个元素处。
 *      bool hasNext() 如果数组中存在下一个元素，返回 true ；否则，返回 false 。
 *      int peek() 返回数组中的下一个元素，但 不 移动指针。
 * @author lizhenyu
 * @date 2021/10/5
 */
public class LeetCode0284 implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer num;

    public LeetCode0284(Iterator<Integer> iterator) {
        this.iterator = iterator;
        this.num = iterator.next();
    }

    public Integer peek() {
        return this.num;
    }

    @Override
    public boolean hasNext() {
        return this.num != null;
    }

    @Override
    public Integer next() {
        Integer result = this.num;
        this.num = this.iterator.hasNext() ? this.iterator.next() : null;
        return result;
    }

}
