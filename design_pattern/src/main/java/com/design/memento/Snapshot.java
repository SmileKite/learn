package com.design.memento;

/**
 * 快照类
 * @author lizhenyu
 * @date 2021/7/18
 */
public class Snapshot {
    /** 快照信息 */
    private String message;
    public Snapshot(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}
