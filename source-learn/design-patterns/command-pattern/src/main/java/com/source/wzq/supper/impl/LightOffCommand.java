package com.source.wzq.supper.impl;

import com.source.wzq.domin.Light;
import com.source.wzq.supper.Command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
