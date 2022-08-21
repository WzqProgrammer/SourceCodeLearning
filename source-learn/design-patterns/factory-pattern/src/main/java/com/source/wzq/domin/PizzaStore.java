package com.source.wzq.domin;

import com.source.wzq.supper.Pizza;
import com.source.wzq.supper.PizzaEnum;

public class PizzaStore {


    private SimplePizzaFactory simplePizzaFactory;
    public PizzaStore(){
        simplePizzaFactory = new SimplePizzaFactory();
    }

    public void orderPizza(PizzaEnum pizzaEnum){
        Pizza pizza = simplePizzaFactory.createPizza(pizzaEnum);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
