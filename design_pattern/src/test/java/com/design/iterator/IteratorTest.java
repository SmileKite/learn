package com.design.iterator;

import com.design.iterator.impl.ArrayList;
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
        List<String> arrayList = new ArrayList<>(5);
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
