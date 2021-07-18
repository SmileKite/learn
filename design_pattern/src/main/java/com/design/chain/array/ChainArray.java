package com.design.chain.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 职责链模式（数组实现）
 * @author lizhenyu
 * @date 2021/7/11
 */
public class ChainArray {
    private List<ITarget> targets;
    public ChainArray() {
        this.targets = new ArrayList<>();
    }
    /**
     * 添加handler
     * @param target handler
     */
    public void add(ITarget target) {
        this.targets.add(target);
    }
    /**
     * 移除handler
     * @param target handler
     */
    public void remove(ITarget target) {
        this.targets.remove(target);
    }
    /**
     * 运行职责链
     */
    public void handle() {
        for (ITarget target : targets) {
            boolean result = target.action();
            if (result) {
                return;
            }
        }
    }
}
