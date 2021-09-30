package com.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1436--[旅行终点站]
 * 给你一份旅游线路图，该线路图中的旅行线路用数组 paths 表示，其中 paths[i] = [cityAi, cityBi] 表示该线路将会从 cityAi 直接前往 cityBi 。
 * 请你找出这次旅行的终点站，即没有任何可以通往其他城市的线路的城市。
 * 题目数据保证线路图会形成一条不存在循环的线路，因此恰有一个旅行终点站。
 * @author lizhenyu
 * @date 2021/10/1
 */
public class LeetCode1436 {

    /**
     * 获取旅行终点
     * @param paths 路线
     * @return 旅行终点
     */
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> path : paths) {
            set.add(path.get(0));
        }
        for (List<String> path : paths) {
            if (!set.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }

}
