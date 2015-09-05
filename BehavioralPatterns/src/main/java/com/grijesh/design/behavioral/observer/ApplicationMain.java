package com.grijesh.design.behavioral.observer;

/**
 * Created by Grijesh Saini on 9/5/2015.
 */
public class ApplicationMain {

    public static void main(String ...args){
        Subject subject = new Subject();
        new Observer1(subject);
        new Observer2(subject);

        subject.setState(1);

    }

}
