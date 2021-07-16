package com.design.factory.abs;

import com.design.factory.target.ParentA;
import com.design.factory.target.ParentB;

/**
 * 工厂接口
 * @author lizhenyu
 * @date 2021/6/14
 */
public interface IFactory {
    /**
     * 创建A类对象
     * @return 创建的对象
     */
    ParentA createA();

    /**
     * 创建B类对象
     * @return 创建的对象
     */
    ParentB createB();
}
