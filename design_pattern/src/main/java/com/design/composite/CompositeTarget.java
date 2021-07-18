package com.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 * @author lizhenyu
 * @date 2021/6/27
 */
public class CompositeTarget extends Target {
    private List<Target> targets;
    public CompositeTarget() {
        this.targets = new ArrayList<>();
    }
    public CompositeTarget(List<Target> targets) {
        this.targets = targets;
    }
    /**
     * 新增元素
     * @param target
     */
    public void add(Target target) {
        this.targets.add(target);
    }
    /**
     * 删除元素
     * @param target
     */
    public void remove(Target target) {
        targets.remove(target);
    }

    @Override
    int count() {
        int count = 0;
        for (Target target : targets) {
            count += target.count();
        }
        return count;
    }

    @Override
    int size() {
        int size = 0;
        for (Target target : targets) {
            size += target.size();
        }
        return size;
    }
}
