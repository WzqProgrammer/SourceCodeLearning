package com.source.wzq.interf.impl;

import com.source.wzq.interf.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("使用翅膀飞翔");
    }
}
