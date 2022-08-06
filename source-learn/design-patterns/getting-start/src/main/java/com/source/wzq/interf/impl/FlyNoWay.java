package com.source.wzq.interf.impl;

import com.source.wzq.interf.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
