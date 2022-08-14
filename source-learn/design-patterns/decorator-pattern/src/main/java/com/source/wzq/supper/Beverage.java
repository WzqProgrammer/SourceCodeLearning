package com.source.wzq.supper;

import lombok.Data;


public abstract class Beverage {

    private String description;

    public Beverage(){
        description = "beverage ";
    }

    public abstract float cost();


    public abstract String getDescription();
}
