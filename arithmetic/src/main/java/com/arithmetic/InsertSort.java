package com.arithmetic;

/**
 * 插入排序
 * @author lizhenyu
 * @date 2021/7/13
 */
public class InsertSort {

    /**
     * 排序
     * @param n 要排序的数组
     */
    public void sort(int[] n) {
        int length = n.length;
        if (length <= 1) {
            return;
        }
        for (int i = 1; i < length; i++) {
            int temp = n[i];
            int j = i-1;
            for (; j > 0; j--) {
                if (n[j] <= temp) {
                    break;
                }
                n[j+1] = n[j];
            }
            n[j+1] = temp;
        }
    }
}
