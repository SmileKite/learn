package com.design.memento;

/**
 * 目标类
 * @author lizhenyu
 * @date 2021/7/18
 */
public class Target {
    private long id;
    /** 需要快照的信息 */
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    /**
     * 创建快照
     * @return 快照信息
     */
    public Snapshot createSnapshot() {
        return new Snapshot(this.message);
    }

    /**
     * 根据快照恢复信息
     * @param snapshot 要恢复的快照信息
     */
    public void restoreSnapshot(Snapshot snapshot) {
        this.message = snapshot.getMessage();
    }
}
