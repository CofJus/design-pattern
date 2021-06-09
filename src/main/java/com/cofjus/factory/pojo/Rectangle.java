package com.cofjus.factory.pojo;

/**
 * @author rui.ji
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
