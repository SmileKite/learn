package com.design.observer.observer;

/**
 * 观察者接口
 * @author lizhenyu
 * @date 2021/6/28
 */
public interface IObserver {
    /**
     * 观察者接收通知执行逻辑
     * @param message 通知内容
     */
    void update(String message);
}
