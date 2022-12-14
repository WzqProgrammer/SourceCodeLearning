package com.source.wzq.domin.store;

import com.source.wzq.domin.factory.ChicagoPizzaIngredientFactory;
import com.source.wzq.domin.pizzas.ChicagoStyleCheesePizza;
import com.source.wzq.domin.pizzas.ClamPizza;
import com.source.wzq.domin.pizzas.PepperoniPizza;
import com.source.wzq.domin.pizzas.VeggiePizza;
import com.source.wzq.supper.Pizza;
import com.source.wzq.supper.PizzaEnum;
import com.source.wzq.supper.PizzaIngredientFactory;
import com.source.wzq.supper.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaEnum pizzaEnum) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

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
                pizza = new ChicagoStyleCheesePizza(pizzaIngredientFactory);
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
