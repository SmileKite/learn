package com.arithmetic;

import org.junit.Test;

/**
 * 冒泡排序测试类
 * @author lizhenyu
 * @date 2021/7/13
 */
public class BubbleSortTest {

    /**
     * 测试冒泡排序
     */
    @Test
    public void testSort() {
        int length = 10;
        int[] n = new int[length];
        System.out.print("排序前的数组为：");
        for (int i = 0; i < length; i++) {
            n[i] = (int) (Math.random()*50);
            System.out.print(n[i]+ " ");
        }

        System.out.println();
        System.out.print("排序后的数组为：");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(n);
        for (int i = 0; i < length; i++) {
            System.out.print(n[i]+ " ");
        }
    }

}
