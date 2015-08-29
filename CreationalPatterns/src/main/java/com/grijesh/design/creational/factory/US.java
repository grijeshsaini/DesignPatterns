package com.grijesh.design.creational.factory;

/**
 * Created by Grijesh Saini on 8/29/2015.
 *
 */
public class US implements Currency {
    @Override
    public String getSymbol() {
        return "$";
    }
}
