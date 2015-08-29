package com.grijesh.design.creational.builder;

/**
 * Created by Grijesh Saini on 8/29/2015.
 * Basic example
 */
public class Vehicle {

    private final String color;
    private final int noOfWheels;

    public static class VehicleBuilder implements GenericBuilder<Vehicle>{
        private String color;
        private int noOfWheels;

        public VehicleBuilder color(String color){
            this.color = color;
            return this;
        }

        public VehicleBuilder noOfWheels(int noOfWheels){
            this.noOfWheels = noOfWheels;
            return this;
        }

        @Override
        public Vehicle build(){
            return new Vehicle(this);
        }

    }

    public Vehicle(VehicleBuilder vehicleBuilder) {
        this.color = vehicleBuilder.color;
        this.noOfWheels = vehicleBuilder.noOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", noOfWheels=" + noOfWheels +
                '}';
    }
}
