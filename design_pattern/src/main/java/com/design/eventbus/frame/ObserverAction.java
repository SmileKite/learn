package com.design.eventbus.frame;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * 观察者方法
 * @author lizhenyu
 * @date 2021/6/30
 */
public class ObserverAction {
    /** 观察者对象 */
    private Object target;
    /** 观察方法 */
    private Method method;
    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }
    /**
     * 执行观察者方法
     * @param event 方法参数
     */
    public void invoke(Object event) {
        try {
            this.method.invoke(target, event);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObserverAction that = (ObserverAction) o;
        return Objects.equals(target, that.target) && Objects.equals(method, that.method);
    }
    @Override
    public int hashCode() {
        return Objects.hash(target, method);
    }
}
