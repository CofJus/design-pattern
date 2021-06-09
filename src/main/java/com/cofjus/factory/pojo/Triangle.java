package com.cofjus.factory.pojo;

/**
 * @author rui.ji
 */
public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Triangle::draw() method.");
    }
}
