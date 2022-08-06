package com.source.wzq.interf.impl;

import com.source.wzq.interf.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不叫");
    }
}
