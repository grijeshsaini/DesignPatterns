package com.grijesh.design.creational.builder;

/**
 * Created by Grijesh Saini on 8/29/2015.
 */
public class ApplicationBuilder {

    public static void main(String ...args){
        Vehicle vehicle = new Vehicle.VehicleBuilder().color("Red").noOfWheels(4).build();
        System.out.println(vehicle);
    }
}
