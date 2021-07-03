package com.design.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 * @author lizhenyu
 * @date 2021/6/27
 */
public class FlyweightDemo {

    @AllArgsConstructor
    static class FlyweightUnit {
        private int id;
        private Color color;
        private String text;
        enum Color {
            RED, BLACK
        }
    }
    static class FlyweightFactory {
        private static final Map<Integer, FlyweightUnit> units = new HashMap<>();
        static {
            units.put(1, new FlyweightUnit(1, FlyweightUnit.Color.RED, "车"));
            units.put(2, new FlyweightUnit(2, FlyweightUnit.Color.BLACK, "车"));
            units.put(3, new FlyweightUnit(3, FlyweightUnit.Color.RED, "马"));
            units.put(4, new FlyweightUnit(4, FlyweightUnit.Color.BLACK, "马"));
            units.put(5, new FlyweightUnit(5, FlyweightUnit.Color.RED, "相"));
            units.put(6, new FlyweightUnit(6, FlyweightUnit.Color.BLACK, "相"));
        }
        public FlyweightUnit getUnit(int id) {
            return units.get(id);
        }
    }
    @AllArgsConstructor
    @Getter
    static class Flyweight {
        private FlyweightUnit unit;
        private int pointX;
        private int pointY;
        public void move(int pointX, int pointY) {
            this.pointX = pointX;
            this.pointY = pointY;
        }
    }
}
