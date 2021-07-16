package com.design.factory.method;

import com.design.factory.target.ParentA;

/**
 * 工厂接口
 * @author lizhenyu
 * @date 2021/6/14
 */
public interface IFactory {
    /**
     * 创建对象
     * @return 创建的对象
     */
    ParentA create();
}
