package com.source.wzq.supper;

import com.source.wzq.supper.Pizza;
import com.source.wzq.supper.PizzaEnum;

public abstract class PizzaStore {

    protected Pizza pizza;


    public void orderPizza(PizzaEnum pizzaEnum){
        pizza = createPizza(pizzaEnum);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    /**
     * 工厂方法
     * @param pizzaEnum
     * @return
     */
    public abstract Pizza createPizza(PizzaEnum pizzaEnum);
}
