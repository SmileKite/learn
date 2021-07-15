package com.design.singleton;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 线程间唯一（非进程唯一）单例
 * @author lizhenyu
 * @date 2021/6/14
 */
public class ThreadSingleton {

    private static final ConcurrentHashMap<Long, ThreadSingleton> instances = new ConcurrentHashMap<>();
    private ThreadSingleton(){}
    public static ThreadSingleton getInstance() {
        long id = Thread.currentThread().getId();
        instances.putIfAbsent(id, new ThreadSingleton());
        return instances.get(id);
    }

}
