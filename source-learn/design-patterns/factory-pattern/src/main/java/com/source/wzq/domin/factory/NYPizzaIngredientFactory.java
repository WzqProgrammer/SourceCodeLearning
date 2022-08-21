package com.source.wzq.domin.factory;

import com.source.wzq.domin.ingredient.MarinaraSauce;
import com.source.wzq.domin.ingredient.ThickCrustDough;
import com.source.wzq.supper.Dough;
import com.source.wzq.supper.PizzaIngredientFactory;
import com.source.wzq.supper.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
