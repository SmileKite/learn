package com.design.visitor.visitable;

import com.design.visitor.visitor.IVisitor;

/**
 * 被访问接口
 * @author lizhenyu
 * @date 2021/7/15
 */
public interface IVisitable {

    /**
     * 接收访问者的方法
     * @param visitor 访问者
     */
    void accept(IVisitor visitor);
}
