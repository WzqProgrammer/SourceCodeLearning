package com.source.wzq.domin;

import com.source.wzq.supper.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        pizzaName = "纽约风格的奶酪披萨";
    }

    @Override
    public void bake() {
        System.out.println(pizzaName + "百年烘培工艺u");
    }
}
