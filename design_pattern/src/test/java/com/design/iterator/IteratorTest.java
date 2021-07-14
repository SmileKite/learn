package com.design.iterator;

import org.junit.Test;

/**
 * 迭代器测试类
 * @author lizhenyu
 * @date 2021/7/14
 */
public class IteratorTest {

    /**
     * 测试迭代器
     */
    @Test
    public void testIterator() {
        IteratorDemo.List<String> arrayList = new IteratorDemo.ArrayList<>(5);
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        IteratorDemo.Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
