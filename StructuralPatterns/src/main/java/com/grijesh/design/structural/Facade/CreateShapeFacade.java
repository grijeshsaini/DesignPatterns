package com.grijesh.design.structural.Facade;

/**
 * Created by Grijesh Saini on 8/29/2015.
 */
public class CreateShapeFacade {

    private Shape circle;
    private Shape rectangle;

    public CreateShapeFacade(){
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
