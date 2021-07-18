package com.design.memento;

import java.util.Stack;

/**
 * 快照栈
 * @author lizhenyu
 * @date 2021/7/18
 */
public class SnapshotHolder {
    /** 快照栈*/
    private Stack<Snapshot> snapshots = new Stack<>();
    /**
     * 快照入栈
     * @param snapshot 快照
     */
    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
    /**
     * 快照出栈（获取最新的快照信息）
     * @return 最新的快照信息
     */
    public Snapshot popSnapshot() {
        return snapshots.pop();
    }
}
