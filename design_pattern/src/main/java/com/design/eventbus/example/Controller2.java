package com.design.eventbus.example;

import com.design.eventbus.example.entry.ChildrenA;
import com.design.eventbus.frame.AsyncEventBus;

import java.util.List;
import java.util.concurrent.*;

/**
 * 被观察者（异步）
 * @author lizhenyu
 * @date 2021/6/30
 */
public class Controller2 {
    private AsyncEventBus eventBus;
    public Controller2() {
        this.eventBus = new AsyncEventBus(Executors.newSingleThreadExecutor());
    }
    public void setObservers(List<Object> observers) {
        for (Object observer : observers) {
            this.eventBus.registry(observer);
        }
    }
    public void action() {
        eventBus.post(new ChildrenA());
        System.out.println("执行action的逻辑");
    }
}
