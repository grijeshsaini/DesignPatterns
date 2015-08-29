package com.grijesh.design.structural.Facade;

/**
 * Created by Grijesh Saini on 8/29/2015.
 */
public class MainApplication {

    public static void main(String ...args){
        CreateShapeFacade facade = new CreateShapeFacade();
        facade.drawCircle();
        facade.drawRectangle();
    }
}
