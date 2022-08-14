package com.source.wzq.domin.seasoning;

import com.source.wzq.supper.Beverage;
import com.source.wzq.supper.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return super.cost() + 2.0f;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Milk ";
    }
}
