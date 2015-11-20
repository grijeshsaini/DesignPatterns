package com.grijesh.design.behavioral.command;

/**
 * Created by grijesh on 21/11/15.
 */
public class OnCommand implements Command {

    private ConsumerElectronics ce;

    public OnCommand(ConsumerElectronics ce) {
        this.ce = ce;
    }

    public void execute() {
        ce.on();
    }
}
