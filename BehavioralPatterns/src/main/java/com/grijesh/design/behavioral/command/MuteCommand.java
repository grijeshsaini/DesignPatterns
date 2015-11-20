package com.grijesh.design.behavioral.command;

/**
 * Created by grijesh on 21/11/15.
 */
public class MuteCommand implements Command {
    ConsumerElectronics ce;

    public MuteCommand(ConsumerElectronics ce) {
        this.ce = ce;
    }

    @Override
    public void execute() {
        ce.mute();
    }
}
