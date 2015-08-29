package com.grijesh.design.creational.singelton;

/**
 * Created by Grijesh Saini on 8/29/2015.
 */
public class EagerInitialization {

    private static EagerInitialization ourInstance = new EagerInitialization();

    public static EagerInitialization getInstance() {
        return ourInstance;
    }

    private EagerInitialization() {
    }

}
