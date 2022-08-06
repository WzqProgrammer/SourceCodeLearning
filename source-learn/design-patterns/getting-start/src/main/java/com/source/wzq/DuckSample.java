package com.source.wzq;

import com.source.wzq.domin.ModelDuck;
import com.source.wzq.domin.RedheadDuck;
import com.source.wzq.interf.impl.FlyRocketPowered;

public class DuckSample {
    public static void main(String[] args) {

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
