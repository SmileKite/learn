package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 0638--[大礼包]
 * 在 LeetCode 商店中， 有 n 件在售的物品。每件物品都有对应的价格。然而，也有一些大礼包，每个大礼包以优惠的价格捆绑销售一组物品。
 * 给你一个整数数组 price 表示物品价格，其中 price[i] 是第 i 件物品的价格。另有一个整数数组 needs 表示购物清单，其中 needs[i] 是需要购买第 i 件物品的数量。
 * 还有一个数组 special 表示大礼包，special[i] 的长度为 n + 1 ，其中 special[i][j] 表示第 i 个大礼包中内含第 j 件物品的数量，且 special[i][n] （也就是数组中的最后一个整数）为第 i 个大礼包的价格。
 * 返回 确切 满足购物清单所需花费的最低价格，你可以充分利用大礼包的优惠活动。你不能购买超出购物清单指定数量的物品，即使那样会降低整体价格。任意大礼包可无限次购买。
 *      n == price.length
 *      n == needs.length
 *      1 <= n <= 6
 *      0 <= price[i] <= 10
 *      0 <= needs[i] <= 10
 *      1 <= special.length <= 100
 *      special[i].length == n + 1
 *      0 <= special[i][j] <= 50
 * @author lizhenyu
 * @date 2021/10/24
 */
public class LeetCode0638 {

    private int n;

    /**
     * dfs深度遍历
     * @param price 商品价格
     * @param special 礼包内容(各个商品数量，总价)
     * @param needs 商品需求数量
     * @return 最小花费
     */
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        this.n = price.size();
        return dfs(price, special, needs);
    }

    private int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        // 不使用大礼包的情况下
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += needs.get(i) * price.get(i);
        }

        // 使用大礼包的情况下
        for (List<Integer> s : special) {
            // 大礼包可以购买无限次
            // 这里相当于深拷贝一个新的List出来，所以，下面不用恢复状态了
            List<Integer> curr = new ArrayList<>(needs);
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                // 判断是否超出数量限制
                if (curr.get(i) - s.get(i) < 0) {
                    flag = true;
                    break;
                }
                curr.set(i, curr.get(i) - s.get(i));
            }

            // 未超出数量限制
            if (!flag) {
                // 选定这个礼包，并继续递归
                ans = Math.min(ans, s.get(n) + dfs(price, special, curr));
            }
        }

        return ans;
    }

}
