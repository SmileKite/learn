package com.design.observer.observable.impl;

import com.design.observer.observable.IObservable;
import com.design.observer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * @author lizhenyu
 * @date 2021/6/28
 */
public class Observable implements IObservable {
    private List<IObserver> observers;
    public Observable() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }
}
