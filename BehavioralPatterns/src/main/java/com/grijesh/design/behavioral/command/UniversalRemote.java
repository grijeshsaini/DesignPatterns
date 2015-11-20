package com.grijesh.design.behavioral.command;

/**
 * Created by grijesh on 21/11/15.
 */
public class UniversalRemote {

    public static ConsumerElectronics getActiveDevice() {
        // here we will have a complex electronic circuit :-)
        // that will maintain current device
        Television tv = new Television();
        return tv;
    }

}