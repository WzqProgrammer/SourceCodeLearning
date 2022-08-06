package com.source.wzq.domin;

import com.source.wzq.interf.impl.FlyNoWay;
import com.source.wzq.interf.impl.MuteQuack;
import com.source.wzq.supper.Duck;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("模型鸭子的display");
    }
}
