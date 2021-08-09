package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 0150--[逆波兰表达式求值]
 * 根据 逆波兰表示法，求表达式的值。
 * 有效的算符包括 +、-、*、/ 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 * 整数除法只保留整数部分。
 * 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 * @author lizhenyu
 * @date 2021/8/9
 */
public class LeetCode0150 {

    /**
     * 逆波兰表达式求值
     * @param tokens 输入值
     * @return 返回值
     */
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new LinkedList<>();
        for (String token : tokens) {
            if (isNum(token)) {
                deque.push(Integer.parseInt(token));
                continue;
            }
            Integer a = deque.pop();
            Integer b = deque.pop();
            switch (token) {
                case "+":
                    deque.push(b + a);
                    break;
                case "-":
                    deque.push(b - a);
                    break;
                case "*":
                    deque.push(b * a);
                    break;
                case "/":
                    deque.push(b / a);
                    break;
                default:
                    break;
            }
        }
        return deque.pop();
    }

    /**
     * 判断是否为数字
     * @param str 字符串
     * @return 是否数字
     */
    private boolean isNum(String str) {
        return !("+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str));
    }

}
