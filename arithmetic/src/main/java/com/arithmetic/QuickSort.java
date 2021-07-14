package com.arithmetic;

/**
 * 快速排序
 * @author lizhenyu
 * @date 2021/7/13
 */
public class QuickSort {

    /**
     * 排序
     * @param n 要排序的数组
     */
    public void sort(int[] n) {
        int length = n.length;
        if (length <= 1) {
            return;
        }
        quickSort(n, 0, length-1);
    }

    /**
     * 快排
     * @param n 要排序的数组
     * @param s 排序范围起始下标
     * @param e 排序范围终止下标
     */
    private void quickSort(int[] n, int s, int e) {
        if (s >= e) {
            return;
        }
        int m = partition(n, s, e);
        quickSort(n, s, m-1);
        quickSort(n, m+1, e);
    }

    /**
     * 将当前数组，取范围最后一个数据，将范围内的数组划分为两部分
     * 分区方法：
     *  使用两个指针，i指向的是小于中间点(这里取的末位下标数据)的区间末尾，j指向的是未检查区间的头
     *  每次找到一个小于中间的的数据，都将其放到i对应的区间末尾下个下标
     * @param n 数组
     * @param s 范围起点
     * @param e 范围终点
     * @return 选中数据最后的下标
     */
    private int partition(int[] n, int s, int e) {
        int pivot = n[e];
        int i = s;
        for (int j = s; j < e; j++) {
            if (n[j] < pivot) {
                if (i == j) {
                    i++;
                    continue;
                }
                int temp = n[i];
                n[i++] = n[j];
                n[j] = temp;
            }
        }
        n[e] = n[i];
        n[i] = pivot;
        return i;
    }

}
