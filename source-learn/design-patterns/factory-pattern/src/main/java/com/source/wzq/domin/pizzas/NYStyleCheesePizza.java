package com.source.wzq.domin.pizzas;

import com.source.wzq.domin.factory.ChicagoPizzaIngredientFactory;
import com.source.wzq.domin.factory.NYPizzaIngredientFactory;
import com.source.wzq.supper.Pizza;
import com.source.wzq.supper.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        pizzaName = "纽约风格的奶酪披萨";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        dough.display();
        sauce.display();
    }

    @Override
    public void bake() {
        System.out.println(pizzaName + "百年烘培工艺u");
    }
}
