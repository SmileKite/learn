package com.design.iterator.impl;

import com.design.iterator.Iterator;
import com.design.iterator.List;

import java.util.NoSuchElementException;

/**
 * 集合实现类
 * @author lizhenyu
 * @date 2021/7/14
 */
public class ArrayList<E> implements List<E> {
    private int size;
    private Object[] items;
    public ArrayList(int initialCapacity) {
        this.items = new Object[initialCapacity];
    }
    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }
    @Override
    public int size() {
        return this.size;
    }
    @Override
    public boolean add(E t) {
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
    class Itr implements Iterator<E> {
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
        public E currentItem() {
            return (E) items[curr];
        }
    }
}
