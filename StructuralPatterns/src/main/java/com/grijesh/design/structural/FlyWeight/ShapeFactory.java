package com.grijesh.design.structural.FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Grijesh Saini on 8/29/2015.
 */
public class ShapeFactory {
    private static final Map<String,Shape> objectHolder = new HashMap<>();

    public static Shape getObject(String color){
        Shape shape = objectHolder.get(color);
        if(shape == null){
            shape = new Circle(color,5);
            objectHolder.put(color,shape);
            return shape;
        }
        return shape;
    }
}
