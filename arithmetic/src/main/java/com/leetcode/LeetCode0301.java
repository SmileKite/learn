package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 0301--[删除无效的括号]
 * 给你一个由若干括号和字母组成的字符串 s ，删除最小数量的无效括号，使得输入的字符串有效。
 * 返回所有可能的结果。答案可以按 任意顺序 返回。
 *      1 <= s.length <= 25
 *      s 由小写英文字母以及括号 '(' 和 ')' 组成
 *      s 中至多含 20 个括号
 * @author lizhenyu
 * @date 2021/10/27
 */
public class LeetCode0301 {

    /**
     * 广度遍历
     * @param s 要检查的字符串
     * @return 可能的结果集
     */
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        // 用来存放要判断的字符串--逐次删除一个括号，广度遍历
        Set<String> temp = new HashSet<>();
        temp.add(s);

        while (true) {
            for (String str : temp) {
                if (check(str)) {
                    result.add(str);
                }
            }
            // 因为要取最少删除次数，所以一旦此处成功，则返回
            if (result.size() > 0) {
                return result;
            }
            // 如果该级别没有符合条件的数据，则清空set然后继续下一级别
            Set<String> set = new HashSet<>();
            for (String str : temp) {
                for (int i = 0, len = str.length(); i < len; i++) {
                    set.add(str.substring(0, i) + str.substring(i + 1));
                }
            }
            temp = set;
        }

    }

    /**
     * 判断是否符合格式
     * @param str 要判断的字符串
     * @return 判断结果 true--符合
     */
    private boolean check(String str) {
        int count = 0;
        char[] cs = str.toCharArray();
        for (char c : cs) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (--count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}
