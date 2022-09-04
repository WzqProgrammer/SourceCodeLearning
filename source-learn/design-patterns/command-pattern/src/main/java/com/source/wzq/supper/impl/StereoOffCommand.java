package com.source.wzq.supper.impl;

import com.source.wzq.domin.Stereo;
import com.source.wzq.supper.Command;

public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
