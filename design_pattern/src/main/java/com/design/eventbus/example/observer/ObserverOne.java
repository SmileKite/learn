package com.design.eventbus.example.observer;

import com.design.eventbus.frame.Subscribe;

/**
 * 观察者1
 * @author lizhenyu
 * @date 2021/6/30
 */
public class ObserverOne {

    @Subscribe
    public void handle() {
        System.out.println("ObserverOne.handle方法执行");
    }

}
