package com.source.wzq.domin.seasoning;

import com.source.wzq.supper.Beverage;
import com.source.wzq.supper.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return super.cost() + 1.0f;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Soy ";
    }
}
