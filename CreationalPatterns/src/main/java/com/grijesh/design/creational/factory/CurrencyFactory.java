package com.grijesh.design.creational.factory;

/**
 * Created by Grijesh Saini on 8/29/2015.
 *
 */
public class CurrencyFactory {

    public static Currency getCurrency(String country){
        switch (country){
            case "India" : return new Indian();
            case "US" : return new US();
            default: throw new RuntimeException("Please provide valid country");
        }
    }
}
