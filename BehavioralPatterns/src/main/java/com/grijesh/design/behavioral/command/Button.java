package com.grijesh.design.behavioral.command;

/**
 * Created by grijesh on 21/11/15.
 */
public class Button {
    Command c;

    public Button(Command c) {
        this.c = c;
    }

    public void click(){
        c.execute();
    }

}
