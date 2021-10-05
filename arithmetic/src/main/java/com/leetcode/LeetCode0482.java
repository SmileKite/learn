package com.leetcode;

/**
 * 0482--[密钥格式化]
 * 有一个密钥字符串 S ，只包含字母，数字以及 '-'（破折号）。其中， N 个 '-' 将字符串分成了 N+1 组。
 * 给你一个数字 K，请你重新格式化字符串，使每个分组恰好包含 K 个字符。特别地，第一个分组包含的字符个数必须小于等于 K，但至少要包含 1 个字符。两个分组之间需要用 '-'（破折号）隔开，并且将所有的小写字母转换为大写字母。
 * 给定非空字符串 S 和数字 K，按照上面描述的规则进行格式化。
 * @author lizhenyu
 * @date 2021/10/4
 */
public class LeetCode0482 {

    /**
     * 密钥格式化
     * @param s 原密钥
     * @param k 新密钥单个组长度
     * @return 新密钥
     */
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '-') {
                index++;
                sb.append(Character.toUpperCase(c));
                if (index % k == 0) {
                    sb.append("-");
                }
            }
        }

        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.reverse().toString();
    }

}
