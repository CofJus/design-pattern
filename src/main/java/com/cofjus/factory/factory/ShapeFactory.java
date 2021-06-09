package com.cofjus.factory.factory;

import com.cofjus.factory.pojo.Circle;
import com.cofjus.factory.pojo.Rectangle;
import com.cofjus.factory.pojo.Shape;
import com.cofjus.factory.pojo.Triangle;

/**
 * 工厂模式
 * @author rui.ji
 */
public class ShapeFactory {

    private static final String CIRCLE = "CIRCLE";

    private static final String RECTANGLE = "RECTANGLE";

    private static final String TRIANGLE = "TRIANGLE";

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case TRIANGLE:
                return new Triangle();
            default:
                return null;
        }
    }
}
