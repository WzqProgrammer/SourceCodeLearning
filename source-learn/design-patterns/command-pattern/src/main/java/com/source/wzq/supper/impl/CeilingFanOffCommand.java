package com.source.wzq.supper.impl;

import com.source.wzq.domin.CeilingFan;
import com.source.wzq.supper.Command;

public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execuate() {
        ceilingFan.on();
    }
}
