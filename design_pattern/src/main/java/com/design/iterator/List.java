package com.design.iterator;

/**
 * 集合接口
 * @author lizhenyu
 * @date 2021/7/14
 */
public interface List<E> {
    /**
     * 获取迭代器
     * @return 迭代器
     */
    Iterator<E> iterator();
    /**
     * 获取数组大小
     * @return 数组大小
     */
    int size();
    /**
     * 新增元素
     * @param t 要新增的元素
     * @return true-新增成功
     */
    boolean add(E t);
    /**
     * 删除元素
     * @param index 要删除的元素下标
     */
    void remove(int index);
}
