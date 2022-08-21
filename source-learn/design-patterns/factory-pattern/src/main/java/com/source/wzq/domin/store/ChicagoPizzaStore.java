package com.source.wzq.domin.store;

import com.source.wzq.domin.*;
import com.source.wzq.supper.Pizza;
import com.source.wzq.supper.PizzaEnum;
import com.source.wzq.supper.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaEnum pizzaEnum) {
        Pizza pizza;

        switch(pizzaEnum){
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
            case CLAM:
                pizza = new ClamPizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case CHEESE:
                // 生产的是芝加哥风味的奶酪披萨
                pizza = new ChicagoStyleCheesePizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
