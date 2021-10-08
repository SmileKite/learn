package com.leetcode;

/**
 * 0434--[字符串中的单词数]
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 * @author lizhenyu
 * @date 2021/10/8
 */
public class LeetCode0434 {

    /**
     * 统计单词个数
     * @param s 字符串
     * @return 单词个数
     */
    public int countSegments(String s) {
        if (s.trim().length() == 0) {
            return 0;
        }
        String[] strs = s.split(" ");
        int result = strs.length;
        for (String str : strs) {
            if ("".equals(str)) {
                result--;
            }
        }
        return result;
    }
}
