package com.leetcode;

/**
 * 0211--[添加与搜索单词 - 数据结构设计]
 * 请你设计一个数据结构，支持 添加新单词 和 查找字符串是否与任何先前添加的字符串匹配 。
 * 实现词典类：
 *      void addWord(word) 将 word 添加到数据结构中，之后可以对它进行匹配
 *      bool search(word) 如果数据结构中存在字符串与word匹配，则返回true；否则，返回false。word中可能包含一些'.'，每个.都可以表示任何一个字母。
 * @author lizhenyu
 * @date 2021/10/19
 */
public class LeetCode0211 {

    private final Trie trie;
    public LeetCode0211() {
        trie = new Trie();
    }

    /**
     * 添加单词
     * @param word 单词
     */
    public void addWord(String word) {
        trie.insert(word);
    }

    /**
     * 搜索单词
     * @param word 要搜索的单词
     * @return 搜索结果
     */
    public boolean search(String word) {
        return dfs(word, 0, trie);
    }

    private boolean dfs(String word, int index, Trie node) {
        if (index == word.length()) {
            return node.isEnd();
        }
        char ch = word.charAt(index);
        if (Character.isLetter(ch)) {
            int childIndex = ch - 'a';
            Trie child = node.getChildren()[childIndex];
            return child != null && dfs(word, index + 1, child);
        } else {
            for (int i = 0; i < 26; i++) {
                Trie child = node.getChildren()[i];
                if (child != null && dfs(word, index + 1, child)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 字典树实现单词搜索
     */
    private class Trie {
        private Trie[] children;
        private boolean isEnd;

        public Trie() {
            children = new Trie[26];
            isEnd = false;
        }

        public void insert(String word) {
            Trie node = this;
            for (int i = 0, len = word.length(); i < len; i++) {
                char ch = word.charAt(i);
                int index = ch - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new Trie();
                }
                node = node.children[index];
            }
            node.isEnd = true;
        }

        public Trie[] getChildren() {
            return this.children;
        }

        public boolean isEnd() {
            return this.isEnd;
        }
    }
}
