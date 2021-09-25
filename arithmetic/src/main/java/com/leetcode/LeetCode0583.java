package com.leetcode;

/**
 * 0583--[两个字符串的删除操作]
 * 给定两个单词 word1 和 word2，找到使得 word1 和 word2 相同所需的最小步数，每步可以删除任意一个字符串中的一个字符。
 * @author lizhenyu
 * @date 2021/9/25
 */
public class LeetCode0583 {

    /**
     * 获取最小操作步数--动态规划
     * @param word1 字符串1
     * @param word2 字符串2
     * @return 最小删除步数
     */
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i < m+1; i++) {
            char c1 = word1.charAt(i-1);
            for (int j = 1; j < n+1; j++) {
                char c2 = word2.charAt(j-1);
                if (c1 == c2) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int maxLen = dp[m][n];
        return m + n - 2 * maxLen;
    }

}
