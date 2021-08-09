package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 0032--[最长有效括号]
 * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 * @author lizhenyu
 * @date 2021/8/9
 */
public class LeetCode0032 {

    /**
     * 链表法
     * @param s 给定字符串
     * @return 最长有效括号的长度
     */
    public int longestValidParenthesesV1(String s) {
        int max = 0;
        Deque<Integer> deque = new LinkedList<>();
        deque.push(-1);

        for (int i = 0, len = s.length(); i < len; i++) {
            if (s.charAt(i) == '(') {
                deque.push(i);
            } else {
                deque.pop();
                if (deque.isEmpty()) {
                    deque.push(i);
                } else {
                    max = Math.max(max, i-deque.peek());
                }
            }
        }

        return max;
    }
}
