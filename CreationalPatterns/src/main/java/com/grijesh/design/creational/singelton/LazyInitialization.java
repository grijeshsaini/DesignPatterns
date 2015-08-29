package com.grijesh.design.creational.singelton;

/**
 * Created by Grijesh Saini on 8/29/2015.
 */
public class LazyInitialization {

    private static LazyInitialization lazyInitializationInstance;

    private LazyInitialization(){

    }

    public static LazyInitialization getInstance(){
        if(lazyInitializationInstance ==null){
            synchronized (LazyInitialization.class){
                if(lazyInitializationInstance == null){
                    lazyInitializationInstance = new LazyInitialization();
                }
            }
        }
        return lazyInitializationInstance;
    }

}
