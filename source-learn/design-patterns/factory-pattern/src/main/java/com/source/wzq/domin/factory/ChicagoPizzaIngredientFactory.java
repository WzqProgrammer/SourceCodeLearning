package com.source.wzq.domin.factory;

import com.source.wzq.domin.ingredient.PlumTomatoSauce;
import com.source.wzq.domin.ingredient.ThinCrustDough;
import com.source.wzq.supper.Dough;
import com.source.wzq.supper.PizzaIngredientFactory;
import com.source.wzq.supper.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
