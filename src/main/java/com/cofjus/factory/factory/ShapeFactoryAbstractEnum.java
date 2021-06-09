package com.cofjus.factory.factory;

import com.cofjus.factory.pojo.Circle;
import com.cofjus.factory.pojo.Rectangle;
import com.cofjus.factory.pojo.Shape;
import com.cofjus.factory.pojo.Triangle;

/**
 * 工厂方法 - 枚举优化 - 抽象方法
 * @author rui.ji
 */
public enum ShapeFactoryAbstractEnum {

    // circle rectangle triangle
    Circle {
        @Override
        public Shape create() {
            return new Circle();
        }
    },
    Rectangle {
        @Override
        public Shape create() {
            return new Rectangle();
        }
    },
    Triangle {
        @Override
        public Shape create() {
            return new Triangle();
        }
    };

    public abstract Shape create();
}
