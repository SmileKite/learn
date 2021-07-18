package com.design.memento;

import org.junit.Test;

/**
 * 备忘录模式测试
 * @author lizhenyu
 * @date 2021/7/18
 */
public class MementoTest {
    /**
     * 备忘录模式测试
     */
    @Test
    public void testMemento() {
        SnapshotHolder holder = new SnapshotHolder();

        Target target = new Target();
        target.setMessage("123");
        holder.pushSnapshot(target.createSnapshot());
        System.out.println(target.getMessage());
        target.setMessage("abc");
        holder.pushSnapshot(target.createSnapshot());
        System.out.println(target.getMessage());
        target.setMessage("测试");
        holder.pushSnapshot(target.createSnapshot());
        System.out.println(target.getMessage());
        Snapshot snapshot = holder.popSnapshot();
        target.restoreSnapshot(snapshot);
        System.out.println(target.getMessage());
        snapshot = holder.popSnapshot();
        target.restoreSnapshot(snapshot);
        System.out.println(target.getMessage());
        snapshot = holder.popSnapshot();
        target.restoreSnapshot(snapshot);
        System.out.println(target.getMessage());
    }
}
