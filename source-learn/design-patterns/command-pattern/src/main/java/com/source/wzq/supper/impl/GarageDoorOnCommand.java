package com.source.wzq.supper.impl;

import com.source.wzq.domin.GarageDoor;
import com.source.wzq.supper.Command;

public class GarageDoorOnCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.on();
    }

    @Override
    public void undo() {
        garageDoor.off();
    }
}
