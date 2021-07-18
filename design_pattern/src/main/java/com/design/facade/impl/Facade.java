package com.design.facade.impl;

import com.design.facade.IFacade;
import com.design.facade.IFacadeA;
import com.design.facade.IFacadeB;

/**
 * 门面模式提供的接口实现类
 * @author lizhenyu
 * @date 2021/6/27
 */
public class Facade implements IFacade {
    private IFacadeA facadeA = new FacadeA();
    private IFacadeB facadeB = new FacadeB();

    @Override
    public void runA() {
        facadeA.actionA();
        facadeB.actionA();
    }

    @Override
    public void runB() {
        facadeA.actionB();
        facadeB.actionB();
    }

    @Override
    public void runC() {
        facadeA.actionA();
        facadeB.actionA();
        facadeB.actionB();
    }
}
