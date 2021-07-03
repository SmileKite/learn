package com.design.eventbus.example.observer;

import com.design.eventbus.example.entry.ChildrenA;
import com.design.eventbus.example.entry.ChildrenB;
import com.design.eventbus.example.entry.Parent;
import com.design.eventbus.frame.Subscribe;

/**
 * 观察者4
 * @author lizhenyu
 * @date 2021/6/30
 */
public class ObserverFour {

    @Subscribe
    public void handle1(ChildrenA children) {
        System.out.println("ObserverFour.handle1方法执行");
    }

    @Subscribe
    public void handle2(ChildrenB children) {
        System.out.println("ObserverFour.handle2方法执行");
    }

    @Subscribe
    public void handle3(Parent parent) {
        System.out.println("ObserverFour.handle3方法执行");
    }

}
