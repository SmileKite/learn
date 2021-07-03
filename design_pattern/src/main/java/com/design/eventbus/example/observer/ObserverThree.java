package com.design.eventbus.example.observer;

import com.design.eventbus.example.entry.Parent;

/**
 * 观察者3
 * @author lizhenyu
 * @date 2021/6/30
 */
public class ObserverThree {

    public void handle(Parent parent) {
        System.out.println("ObserverThree.handle方法执行");
    }

}
