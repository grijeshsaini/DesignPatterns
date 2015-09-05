package com.grijesh.design.behavioral.observer;

/**
 * Created by Grijesh Saini on 9/5/2015.
 */
public abstract class Observer {
    public Subject subject;
    public abstract void update();
}
