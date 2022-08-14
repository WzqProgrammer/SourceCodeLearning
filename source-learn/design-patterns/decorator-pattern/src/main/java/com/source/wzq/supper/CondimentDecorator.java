package com.source.wzq.supper;

public class CondimentDecorator extends Beverage{

    private Beverage beverage;

    public CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
