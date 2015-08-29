package com.grijesh.design.creational.factory;

/**
 * Created by Grijesh Saini on 8/29/2015.
 */
public class ApplicationFactory {

    public static void main(String ...args){
        String country = "India";
        Currency currency = CurrencyFactory.getCurrency(country);
        System.out.println("Country: " +country + " ,Symbol: "+currency.getSymbol());
    }
}
