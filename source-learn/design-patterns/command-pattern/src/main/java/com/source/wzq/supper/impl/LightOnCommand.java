package com.source.wzq.supper.impl;

import com.source.wzq.domin.Light;
import com.source.wzq.supper.Command;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
