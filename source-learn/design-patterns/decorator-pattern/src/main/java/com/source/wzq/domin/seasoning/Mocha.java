package com.source.wzq.domin.seasoning;

import com.source.wzq.supper.Beverage;
import com.source.wzq.supper.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return super.cost() + 4.0f;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Mocha  ";
    }
}
