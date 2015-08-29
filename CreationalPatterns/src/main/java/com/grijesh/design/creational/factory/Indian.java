package com.grijesh.design.creational.factory;

/**
 * Created by Grijesh Saini on 8/29/2015.
 *
 */
public class Indian implements Currency {
    @Override
    public String getSymbol() {
        return "RS"; // Change keyboard layout to EN-IN to print rupee symbol
    }
}
