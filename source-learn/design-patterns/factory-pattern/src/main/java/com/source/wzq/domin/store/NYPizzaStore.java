package com.source.wzq.domin.store;

import com.source.wzq.domin.factory.ChicagoPizzaIngredientFactory;
import com.source.wzq.domin.factory.NYPizzaIngredientFactory;
import com.source.wzq.domin.pizzas.ClamPizza;
import com.source.wzq.domin.pizzas.NYStyleCheesePizza;
import com.source.wzq.domin.pizzas.PepperoniPizza;
import com.source.wzq.domin.pizzas.VeggiePizza;
import com.source.wzq.supper.Pizza;
import com.source.wzq.supper.PizzaEnum;
import com.source.wzq.supper.PizzaIngredientFactory;
import com.source.wzq.supper.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaEnum pizzaEnum) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
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
                // 生产的是纽约风味的奶酪披萨
                pizza = new NYStyleCheesePizza(pizzaIngredientFactory);
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
