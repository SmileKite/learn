package com.design.eventbus.example.observer;

import com.design.eventbus.example.entry.ChildrenA;
import com.design.eventbus.example.entry.ChildrenB;
import com.design.eventbus.example.entry.Parent;
import com.design.eventbus.frame.Subscribe;

/**
 * @author lizhenyu
 * @date 2021/6/30
 */
public class ObserverFive {

    @Subscribe
    public void deal1(ChildrenA children) {
        System.out.println("ObserverFour.deal1方法执行");
    }

    @Subscribe
    public void deal2(ChildrenB children) {
        System.out.println("ObserverFour.deal2方法执行");
    }

    @Subscribe
    public void deal3(Parent parent) {
        System.out.println("ObserverFour.deal3方法执行");
    }

}
