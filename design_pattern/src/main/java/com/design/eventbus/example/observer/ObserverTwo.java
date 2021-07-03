package com.design.eventbus.example.observer;

import com.design.eventbus.example.entry.ChildrenA;
import com.design.eventbus.example.entry.ChildrenB;
import com.design.eventbus.frame.Subscribe;

/**
 * 观察者2
 * @author lizhenyu
 * @date 2021/6/30
 */
public class ObserverTwo {

    @Subscribe
    public void handle(ChildrenA childrenA, ChildrenB childrenB) {
        System.out.println("ObserverTwo.handle方法执行");
    }

}
