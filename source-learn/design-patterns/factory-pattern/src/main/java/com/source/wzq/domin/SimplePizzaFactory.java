package com.source.wzq.domin;

import com.source.wzq.supper.Pizza;
import com.source.wzq.supper.PizzaEnum;

/**
 * @author wangzhengqing
 */
public class SimplePizzaFactory {

    public Pizza createPizza(PizzaEnum pizzaEnum){
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
                pizza = new CheesePizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
