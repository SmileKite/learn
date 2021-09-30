package com.leetcode;

/**
 * 0223-[矩形面积]
 * 给你 二维 平面上两个 由直线构成的 矩形，请你计算并返回两个矩形覆盖的总面积。
 * 每个矩形由其 左下 顶点和 右上 顶点坐标表示：
 *      第一个矩形由其左下顶点 (ax1, ay1) 和右上顶点 (ax2, ay2) 定义。
 *      第二个矩形由其左下顶点 (bx1, by1) 和右上顶点 (bx2, by2) 定义。
 * @author lizhenyu
 * @date 2021/9/30
 */
public class LeetCode0223 {

    /**
     * 计算面积
     * @param ax1 矩形1左x
     * @param ay1 矩形1下y
     * @param ax2 矩形1右x
     * @param ay2 矩形1上y
     * @param bx1 矩形2左x
     * @param by1 矩形2下y
     * @param bx2 矩形2右x
     * @param by2 矩形2上y
     * @return 占用面积
     */
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int crossArea;
        if (ax1 >= bx2 || bx1 >= ax2 || ay1 >= by2 || by1 >= ay2) {
            crossArea = 0;
        } else {
            int minX = Math.max(ax1, bx1);
            int maxX = Math.min(ax2, bx2);
            int minY = Math.max(ay1, by1);
            int maxY = Math.min(ay2, by2);
            crossArea = (maxX-minX) * (maxY-minY);
        }
        return (ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1) - crossArea;
    }
}
