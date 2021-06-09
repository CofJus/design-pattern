package com.cofjus.factory.factory;

import com.cofjus.factory.pojo.Circle;
import com.cofjus.factory.pojo.Rectangle;
import com.cofjus.factory.pojo.Shape;
import com.cofjus.factory.pojo.Triangle;

/**
 * 简单工厂(静态工厂)
 * @author rui.ji
 */
public class EasyShapeFactory {

    private static Shape shape;

    public static Shape getCircleInstance() {
        return new Circle();
    }

    public static Shape getRectangleInstance() {
        return new Rectangle();
    }

    /**
     * 利用简单工厂实现单例模式(非线程安全懒汉)
     * @return Triangle
     */
    public static Shape getTriangleInstance() {
        if(null == shape) {
            shape = new Triangle();
        }
        return shape;
    }
}
