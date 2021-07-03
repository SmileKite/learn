package com.design.eventbus.example;

import com.design.eventbus.example.entry.ChildrenA;
import com.design.eventbus.example.entry.ChildrenB;
import com.design.eventbus.example.entry.Parent;
import com.design.eventbus.frame.EventBus;

import java.util.List;

/**
 * 被观察者（同步）
 * @author lizhenyu
 * @date 2021/6/30
 */
public class Controller1 {
    private EventBus eventBus;
    public Controller1() {
        this.eventBus = new EventBus();
    }
    public void setObservers(List<Object> observers) {
        for (Object observer : observers) {
            this.eventBus.registry(observer);
        }
    }
    public void action1() {
        eventBus.post(new ChildrenA());
        System.out.println("执行action1的逻辑");
    }
    public void action2() {
        eventBus.post(new ChildrenB());
        System.out.println("执行action2的逻辑");
    }
    public void action3() {
        eventBus.post(new Parent());
        System.out.println("执行action3的逻辑");
    }
}
