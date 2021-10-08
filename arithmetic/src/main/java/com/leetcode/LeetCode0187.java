package com.leetcode;

import java.util.*;

/**
 * 0187--[重复的DNA序列]
 * 所有 DNA 都由一系列缩写为 'A'，'C'，'G' 和 'T' 的核苷酸组成，例如："ACGAATTCCG"。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。
 * 编写一个函数来找出所有目标子串，目标子串的长度为 10，且在 DNA 字符串 s 中出现次数超过一次。
 * @author lizhenyu
 * @date 2021/10/8
 */
public class LeetCode0187 {

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> result = new HashSet<>();
        Set<String> set = new HashSet<>();

        for (int i = 0, len = s.length() - 10; i <= len; i++) {
            String str = s.substring(i, i+10);
            if (!set.add(str)) {
                result.add(str);
            }
        }

        return new ArrayList<>(result);
    }
}
