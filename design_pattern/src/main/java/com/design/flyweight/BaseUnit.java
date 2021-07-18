package com.design.flyweight;

import java.awt.*;

/**
 * 享元单元（象棋棋子基础信息）
 * @author lizhenyu
 * @date 2021/6/27
 */
public class BaseUnit {
    /** 棋子类型 */
    private String name;
    /** 棋子颜色 */
    private Color color;
    public BaseUnit(String name, Color color) {
        this.name = name;
        this.color = color;
    }
}
