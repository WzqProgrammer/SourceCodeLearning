package com.source.wzq;

import com.source.wzq.domin.*;
import com.source.wzq.supper.Command;
import com.source.wzq.supper.impl.*;

/**
 * @author wangzhengqing
 */
public class RemoteControlSample {
    public static void main(String[] args) {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        Command garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
        Command garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);
        Command stereoOnCommand = new StereoOnCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);
        Command ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn = {lightOffCommand, stereoOnCommand, garageDoorOffCommand};
        Command[] partyOff = {lightOnCommand, stereoOffCommand, garageDoorOnCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorOnCommand, garageDoorOffCommand);
        remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);
        remoteControl.setCommand(3,ceilingFanOnCommand, ceilingFanOffCommand);

        remoteControl.setCommand(4, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
    }
}
