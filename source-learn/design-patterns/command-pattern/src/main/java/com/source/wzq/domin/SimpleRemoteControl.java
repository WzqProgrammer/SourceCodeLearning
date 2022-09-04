package com.source.wzq.domin;

import com.source.wzq.supper.Command;

/**
 * @author wangzhengqing
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
