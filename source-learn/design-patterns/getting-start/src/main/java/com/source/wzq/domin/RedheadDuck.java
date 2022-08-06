package com.source.wzq.domin;

import com.source.wzq.interf.impl.FlyWithWings;
import com.source.wzq.interf.impl.Quack;
import com.source.wzq.supper.Duck;

public class RedheadDuck extends Duck {

    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("红头鸭的display，外观是红头");
    }
}
