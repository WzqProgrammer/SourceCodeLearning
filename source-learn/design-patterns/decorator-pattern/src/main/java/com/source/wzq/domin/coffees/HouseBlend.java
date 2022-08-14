package com.source.wzq.domin.coffees;

import com.source.wzq.supper.Beverage;

public class HouseBlend extends Beverage {


    @Override
    public float cost() {
        return 10.0f;
    }

    @Override
    public String getDescription() {
        return "HouseBlend ";
    }
}
