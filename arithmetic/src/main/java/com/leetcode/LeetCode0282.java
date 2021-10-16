package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 0282--[给表达式添加运算符]
 * 给定一个仅包含数字0-9的字符串 num 和一个目标值整数 target ，在 num 的数字之间添加 二元 运算符（不是一元）+、-或*，返回所有能够得到目标值的表达式。
 * @author lizhenyu
 * @date 2021/10/16
 */
public class LeetCode0282 {
    /**
     * 符合条件的结果集
     */
    private List<String> result;
    /**
     * 给定数字字符串的长度
     */
    private int len;
    /**
     * 目标值
     */
    private int target;
    /**
     * 给定数字字符串
     */
    private String num;

    public List<String> addOperators(String num, int target) {
        this.result = new ArrayList<>();
        this.len = num.length();
        this.target = target;
        this.num = num;

        StringBuilder sb = new StringBuilder();
        backtrack(sb, 0, 0, 0);
        return result;
    }

    public void backtrack(StringBuilder expr, int i, long res, long mul) {
        if (i == len) {
            if (res == target) {
                result.add(expr.toString());
            }
            return;
        }
        int signIndex = expr.length();
        // 占位，用于填充符号--表达式开头不能添加符号
        if (i > 0) {
            expr.append(0);
        }
        long val = 0;
        // 从当前下标开始循环获取下一个数字，注意碰到前导0要停止
        for (int j = i; j < len && (j == i || num.charAt(i) != '0'); ++j) {
            val = val * 10 + num.charAt(j) - '0';
            expr.append(num.charAt(j));
            if (i == 0) {
                // 表达式开头不能添加符号
                backtrack(expr, j + 1, val, val);
            } else {
                // 依次执行+-*的情况
                expr.setCharAt(signIndex, '+');
                backtrack(expr, j + 1, res + val, val);
                expr.setCharAt(signIndex, '-');
                backtrack(expr, j + 1, res - val, -val);
                expr.setCharAt(signIndex, '*');
                backtrack(expr, j + 1, res - mul + mul * val, mul * val);
            }
        }
        expr.setLength(signIndex);
    }
}
