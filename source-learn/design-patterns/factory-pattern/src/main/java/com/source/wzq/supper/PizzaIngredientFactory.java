package com.source.wzq.supper;

import com.source.wzq.supper.Dough;
import com.source.wzq.supper.Sauce;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();
}
