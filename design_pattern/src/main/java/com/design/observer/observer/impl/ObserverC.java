package com.design.observer.observer.impl;

import com.design.observer.observer.IObserver;

/**
 * 观察者C
 * @author lizhenyu
 * @date 2021/6/28
 */
public class ObserverC implements IObserver {
    @Override
    public void update(String message) {
        System.out.println("观察者C接收消息："+message+"，执行逻辑");
    }
}
