package com.source.wzq.supper.impl;

import com.source.wzq.domin.Stereo;
import com.source.wzq.supper.Command;

public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {

        stereo.on();
        stereo.setDvd();
        stereo.setVolume(10);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
