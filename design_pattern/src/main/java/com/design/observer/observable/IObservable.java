package com.design.observer.observable;

import com.design.observer.observer.IObserver;

/**
 * 被观察者接口
 * @author lizhenyu
 * @date 2021/6/28
 */
public interface IObservable {
    /**
     * 注册观察者
     * @param observer 观察者
     */
    void registerObserver(IObserver observer);

    /**
     * 移除观察者
     * @param observer 观察者
     */
    void removeObserver(IObserver observer);

    /**
     * 通知观察者
     * @param message 通知内容
     */
    void notifyObserver(String message);
}
