package com.grijesh.design.behavioral.command;

/**
 * Created by grijesh on 21/11/15.
 */
public class MusicPlayer implements ConsumerElectronics {

    public void on() {
        System.out.println("Sound system is on!");
    }

    @Override
    public void mute() {
        System.out.println("Sound system is muted!");

    }
}