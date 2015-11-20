package com.grijesh.design.behavioral.command;

/**
 * Created by grijesh on 21/11/15.
 */
public class Television implements ConsumerElectronics {

    public void on() {
        System.out.println("Television is on!");
    }

    @Override
    public void mute() {
        System.out.println("Television is muted!");

    }
}
