package com.design.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式工厂类
 * @author lizhenyu
 * @date 2021/6/27
 */
public class FlyweightFactory {

    private static final Map<Integer, BaseUnit> UNITS = new HashMap<>();
    static {
        UNITS.put(1, new BaseUnit("车", Color.RED));
        UNITS.put(2, new BaseUnit("马", Color.RED));
        UNITS.put(3, new BaseUnit("相", Color.RED));
        UNITS.put(4, new BaseUnit("士", Color.RED));
        UNITS.put(5, new BaseUnit("炮", Color.RED));
        UNITS.put(6, new BaseUnit("兵", Color.RED));
        UNITS.put(7, new BaseUnit("帅", Color.RED));
        UNITS.put(8, new BaseUnit("车", Color.BLACK));
        UNITS.put(9, new BaseUnit("马", Color.BLACK));
        UNITS.put(10, new BaseUnit("相", Color.BLACK));
        UNITS.put(11, new BaseUnit("士", Color.BLACK));
        UNITS.put(12, new BaseUnit("炮", Color.BLACK));
        UNITS.put(13, new BaseUnit("卒", Color.BLACK));
        UNITS.put(14, new BaseUnit("将", Color.BLACK));
    }
    public BaseUnit getUnit(int id) {
        return UNITS.get(id);
    }
}
