package com.cofjus.factory.factory;

import com.cofjus.factory.pojo.Circle;
import com.cofjus.factory.pojo.Rectangle;
import com.cofjus.factory.pojo.Shape;
import com.cofjus.factory.pojo.Triangle;

/**
 * 工厂方法 - 枚举优化
 * @author rui.ji
 */
public enum ShapeFactoryEnum {

    // circle rectangle triangle
    Circle, Rectangle, Triangle;

    public Shape getShape() {
        switch (this) {
            case Circle:
                return new Circle();
            case Rectangle:
                return new Rectangle();
            case Triangle:
                return new Triangle();
            default:
                return null;
        }
    }
}
