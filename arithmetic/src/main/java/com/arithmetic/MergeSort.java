package com.arithmetic;

/**
 * 归并排序
 * @author lizhenyu
 * @date 2021/7/13
 */
public class MergeSort {

    /**
     * 排序
     * @param n 要排序的数组
     */
    public void sort(int[] n) {
        int length = n.length;
        if (length <= 1) {
            return;
        }
        mergeSort(n, 0, length-1);
    }

    /**
     * 递归进行排序
     * @param n 要排序的数组
     * @param s 排序的起始下标
     * @param e 排序的终止下标
     */
    private void mergeSort(int[] n, int s, int e) {
        if (s >= e) {
            return;
        }

        int m = s + (e-s)/2;
        mergeSort(n, s, m);
        mergeSort(n, m+1, e);

        merge(n, s, m, e);
    }

    /**
     * 合并两个有序数组(利用哨兵)
     * @param n 要合并的数组
     * @param s 头下标
     * @param m 中间下标
     * @param e 尾下标
     */
    private void merge(int[] n, int s, int m, int e) {
        int[] left = new int[m-s+2];
        int[] right = new int[e-m+1];

        for (int i = 0, len=m-s; i <= len; i++) {
            left[i] = n[s+i];
        }
        left[m-s+1] = Integer.MAX_VALUE;
        for (int i = 0, len=e-m; i < len; i++) {
            right[i] = n[m+i+1];
        }
        right[e-m] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        int k = s;
        while (k <= e) {
            if (left[i] < right[j]) {
                n[k++] = left[i++];
            } else {
                n[k++] = right[j++];
            }
        }
    }

}
