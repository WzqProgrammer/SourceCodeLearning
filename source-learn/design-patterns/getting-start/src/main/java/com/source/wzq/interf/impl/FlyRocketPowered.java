package com.source.wzq.interf.impl;

import com.source.wzq.interf.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("火箭飞行");
    }
}
