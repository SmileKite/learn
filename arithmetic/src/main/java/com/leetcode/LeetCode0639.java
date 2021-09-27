package com.leetcode;

/**
 * 0639--[解码方法 II]
 * 一条包含字母 A-Z 的消息通过以下的方式进行了编码：A-1 B-2 ... Z-26
 * 要 解码 一条已编码的消息，所有的数字都必须分组，然后按原来的编码方案反向映射回字母（可能存在多种方式）。
 * 除了 上面描述的数字字母映射方案，编码消息中可能包含 '*' 字符，可以表示从 '1' 到 '9' 的任一数字（不包括 '0'）。
 * 给你一个字符串 s ，由数字和 '*' 字符组成，返回 解码 该字符串的方法 数目 。
 * 由于答案数目可能非常大，返回对 109 + 7 取余 的结果。
 * @author lizhenyu
 * @date 2021/9/27
 */
public class LeetCode0639 {

    /**
     * 使用动态规划：f(i)表示第1-i个元素中的最大解码方案
     * 状态1：f(i+1)使用第i+1个元素
     *      如果该元素为0，f(i+1) = 0
     *      如果该元素为*，f(i+1) = f(i)*9
     *      如果该元素为1-9，f(i+1) = f(i)
     * 状态2：f(i+1)使用第i和i+1个元素
     *      如果两个元素都为*，f(i+1) = f(i-1)*15
     *      如果第一个元素为*，第二个元素不为*
     *          第二个元素为0-6，f(i+1) = f(i-1)*2
     *          第二个元素为7-9，f(i+1) = f(i-1)
     *      如果第一个元素不为*，第二个元素为*
     *          第一个元素为1，f(i+1) = f(i-1)*9
     *          第一个元素为2，f(i+1) = f(i-1)*6
     *          第一个元素为0或3-9，f(i+1) = 0
     *      如果两个元素都不为*，f(i+1) = f(i-1)
     * @param s 传入的字符串
     * @return 返回解码最大个数
     */
    public int numDecodings(String s) {
        int mod = 1000000007;
        int n = s.length();
        // a f[i-2] b f[i-1] c f[i]
        long a = 0;
        long b = 1;
        long c = 0;
        for (int i = 1; i <= n; i++) {
            c = b * check1digit(s.charAt(i - 1)) % mod;
            if (i > 1) {
                c = (c + a * check2digit(s.charAt(i - 2), s.charAt(i - 1))) % mod;
            }
            a = b;
            b = c;
        }
        return (int) c;
    }

    /**
     * 状态1---使用一个元素
     * @param ch 判断元素
     * @return 倍数
     */
    private int check1digit(char ch) {
        if (ch == '0') {
            return 0;
        }
        return ch == '*' ? 9 : 1;
    }

    /**
     * 状态2---使用两个元素
     * @param c1 判断元素1
     * @param c2 判断元素2
     * @return 倍数
     */
    private int check2digit(char c1, char c2) {
        if ('*' == c1 && '*' == c2) {
            return 15;
        }
        if ('*' == c1) {
            return c2 <= '6' ? 2 : 1;
        }
        if ('*' == c2) {
            if ('1' == c1) {
                return 9;
            }
            if ('2' == c1) {
                return 6;
            }
            return 0;
        }
        return (c1 != '0' && (c1 - '0') * 10 + (c2 - '0') <= 26) ? 1 : 0;
    }
}
