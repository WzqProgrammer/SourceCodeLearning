package com.source.wzq.supper.impl;

import com.source.wzq.domin.GarageDoor;
import com.source.wzq.supper.Command;

public class GarageDoorOffCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.off();
    }

    @Override
    public void undo() {
        garageDoor.on();
    }
}
