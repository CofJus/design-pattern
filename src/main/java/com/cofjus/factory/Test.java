package com.cofjus.factory;

import com.cofjus.factory.factory.EasyShapeFactory;
import com.cofjus.factory.factory.ShapeFactory;
import com.cofjus.factory.factory.ShapeFactoryAbstractEnum;
import com.cofjus.factory.factory.ShapeFactoryEnum;
import com.cofjus.factory.pojo.Circle;
import com.cofjus.factory.pojo.Rectangle;
import com.cofjus.factory.pojo.Triangle;

/**
 * @author rui.ji
 */
public class Test {
    public static void main(String... args) {

        // 简单工厂
        Circle circle = (Circle) EasyShapeFactory.getCircleInstance();
        circle.draw();

        // 工厂模式
        ShapeFactory shapeFactory = new ShapeFactory();
        Triangle triangle = (Triangle) shapeFactory.getShape("TRIANGLE");
        triangle.draw();

        // 工厂模式 - 枚举优化
        Rectangle rectangle = (Rectangle) ShapeFactoryEnum.Rectangle.getShape();
        assert rectangle != null;
        rectangle.draw();

        // 工厂模式 - 枚举优化 - 抽象方法
        Rectangle rectangleAbstract = (Rectangle) ShapeFactoryAbstractEnum.Rectangle.create();
        rectangleAbstract.draw();

    }
}
