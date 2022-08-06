package com.source.wzq.supper;

import com.source.wzq.interf.FlyBehavior;
import com.source.wzq.interf.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck(){}

    public void swim(){
        System.out.println("所有的鸭子都会游泳");
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    };

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

}
