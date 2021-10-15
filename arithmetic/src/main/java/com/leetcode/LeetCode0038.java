package com.leetcode;

/**
 * 0038--[外观数列]
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 * 你可以将其视作是由递归公式定义的数字字符串序列：
 *      countAndSay(1) = "1"
 *      countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
 * @author lizhenyu
 * @date 2021/10/15
 */
public class LeetCode0038 {

    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int start = 0;
            int pos = 0;

            while (pos < result.length()) {
                while (pos < result.length() && result.charAt(pos) == result.charAt(start)) {
                    pos++;
                }
                sb.append(pos-start).append(result.charAt(start));
                start = pos;
            }
            result = sb.toString();
        }
        return result;
    }
}
