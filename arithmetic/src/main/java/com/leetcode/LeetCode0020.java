package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 0020--[有效的括号]
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 *  1、左括号必须用相同类型的右括号闭合。
 *  2、左括号必须以正确的顺序闭合。
 * @author lizhenyu
 * @date 2021/8/9
 */
public class LeetCode0020 {

    /**
     * 有效括号的判断
     * @param s 给定字符串
     * @return 是否为有效括号
     */
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> codes = new HashMap<>(3);
        codes.put('(', ')');
        codes.put('[', ']');
        codes.put('{', '}');

        Stack<Character> stack = new Stack();
        for (int i = 0, len = s.length(); i < len; i++) {
            char c = s.charAt(i);
            if (codes.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character left = stack.pop();
                Character right = codes.get(left);
                if (!right.equals(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
