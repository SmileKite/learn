package com.design.visitor;

import com.design.visitor.visitable.IVisitable;
import com.design.visitor.visitable.impl.VisitableA;
import com.design.visitor.visitable.impl.VisitableB;
import com.design.visitor.visitable.impl.VisitableC;
import com.design.visitor.visitor.impl.VisitorA;
import com.design.visitor.visitor.impl.VisitorB;
import com.design.visitor.visitor.impl.VisitorC;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式测试类
 * @author lizhenyu
 * @date 2021/7/15
 */
public class VisitorTest {

    /**
     * 测试访问者模式
     */
    @Test
    public void testVisitor() {
        List<IVisitable> lists = listVisitable();
        for (IVisitable visitable : lists) {
            visitable.accept(new VisitorA());
            visitable.accept(new VisitorB());
            visitable.accept(new VisitorC());
        }
    }

    /**
     * 获取被访问者集合
     * @return 被访问者集合
     */
    private List<IVisitable> listVisitable() {
        List<IVisitable> lists = new ArrayList<>();
        lists.add(new VisitableA());
        lists.add(new VisitableB());
        lists.add(new VisitableC());
        return lists;
    }
}
