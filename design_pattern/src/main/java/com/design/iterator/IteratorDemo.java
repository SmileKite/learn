package com.design.iterator;

import java.util.NoSuchElementException;

/**
 * 迭代器模式
 * @author lizhenyu
 * @date 2021/7/14
 */
public class IteratorDemo {
    /**
     * 集合接口
     * @param <T> 集合元素
     */
    interface List<T> {
        /**
         * 获取迭代器
         * @return 迭代器
         */
        Iterator<T> iterator();
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
        boolean add(T t);
        /**
         * 删除元素
         * @param index 要删除的元素下标
         */
        void remove(int index);
    }

    /**
     * 集合实现类
     * @param <T> 集合元素
     */
    static class ArrayList<T> implements List<T> {
        private int size;
        private Object[] items;
        public ArrayList(int initialCapacity) {
            this.items = new Object[initialCapacity];
        }
        @Override
        public Iterator<T> iterator() {
            return new Itr();
        }
        @Override
        public int size() {
            return this.size;
        }
        @Override
        public boolean add(T t) {
            if (size == items.length) {
                return false;
            }
            items[size++] = t;
            return true;
        }
        @Override
        public void remove(int index) {
            if (index < size-1) {
                System.arraycopy(items, index+1, items, index, size-index-1);
            }
            items[--size] = null;
        }

        /**
         * 迭代器
         */
        class Itr implements Iterator<T> {
            private int curr;
            @Override
            public boolean hasNext() {
                return curr < size;
            }
            @Override
            public void next() {
                if (curr >= size) {
                    throw new NoSuchElementException();
                }
                curr++;
            }
            @Override
            public T currentItem() {
                return (T) items[curr];
            }
        }
    }

    interface Iterator<T> {
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
        T currentItem();
    }
}
