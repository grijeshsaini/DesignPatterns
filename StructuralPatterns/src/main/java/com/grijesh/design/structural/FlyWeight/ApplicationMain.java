package com.grijesh.design.structural.FlyWeight;

/**
 * Created by Grijesh Saini on 8/29/2015.
 */
public class ApplicationMain {
    public static void main(String ...args){

        Shape shape = ShapeFactory.getObject("Red");
        shape.draw();
        Shape shape1 = ShapeFactory.getObject("Red");
        shape1.draw();
        System.out.println(shape == shape1);
    }
}
