package com.source.wzq.domin.pizzas;

import com.source.wzq.domin.factory.ChicagoPizzaIngredientFactory;
import com.source.wzq.supper.Pizza;
import com.source.wzq.supper.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {


    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        pizzaName = "芝加哥风味的奶酪披萨";
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
    public void cut() {
        System.out.println(pizzaName + " 乱刀切分");
    }
}
