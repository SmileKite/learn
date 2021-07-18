package com.design.iterator;

/**
 * 迭代器接口
 * @author lizhenyu
 * @date 2021/7/14
 */
public interface Iterator<E> {
    /**
     * 是否还有下个元素
     * @return true--有下个元素
     */
    boolean hasNext();
    /**
     * 游标后移
     */
    void next();
    /**
     * 获取当前元素
     * @return 当前元素
     */
    E currentItem();
}
