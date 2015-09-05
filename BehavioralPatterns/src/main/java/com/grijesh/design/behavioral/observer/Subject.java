package com.grijesh.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Grijesh Saini on 9/5/2015.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObserver(){
        observers.forEach(observer -> observer.update());
    }
}
