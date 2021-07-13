package com.arithmetic;

/**
 * 选择排序
 * @author lizhenyu
 * @date 2021/7/13
 */
public class SelectSort {

    /**
     * 排序
     * @param n 要排序的数组
     */
    public void sort(int[] n) {
        int length = n.length;
        if (length <= 1) {
            return;
        }
        for (int i = 0, len = length-1; i < len; i++) {
            int min = i;
            for (int j = i+1; j < length; j++) {
                if (n[min] > n[j]) {
                    min = j;
                }
            }
            int temp = n[i];
            n[i] = n[min];
            n[min] = temp;
        }
    }
}
