package com.arithmetic;

/**
 * 冒泡排序
 * @author lizhenyu
 * @date 2021/7/13
 */
public class BubbleSort {

    /**
     * 排序
     * @param a 要排序的数组
     */
    public void sort(int[] a) {
        int length = a.length;
        if (length <= 1) {
            return;
        }
        for (int i = 0; i < length; i++) {
            // 提前跳出循环的标志
            boolean flag = true;
            for (int j = 0, len = length-i-1; j < len; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
