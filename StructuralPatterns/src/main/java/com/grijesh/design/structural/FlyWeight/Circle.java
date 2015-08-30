package com.grijesh.design.structural.FlyWeight;


/**
 * Created by Grijesh Saini on 8/29/2015.
 */
public class Circle implements Shape {
    private String color;
    private int radius;


    public Circle(String color,int radius){
        this.color = color;
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Circle is created");
    }
}
