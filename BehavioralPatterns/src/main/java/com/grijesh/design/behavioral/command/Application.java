package com.grijesh.design.behavioral.command;

/**
 * Created by grijesh on 21/11/15.
 */
public class Application {

    public static void main(String args[]) {

        // OnCommand is instantiated based on active device supplied by Remote
        ConsumerElectronics ce = UniversalRemote.getActiveDevice();
        OnCommand onCommand = new OnCommand(ce);
        Button onButton = new Button(onCommand);
        onButton.click();

        MusicPlayer musicPlayer = new MusicPlayer();
        MuteCommand mute = new MuteCommand(musicPlayer);
        Button muteAllButton = new Button(mute);
        muteAllButton.click();

    }
}
