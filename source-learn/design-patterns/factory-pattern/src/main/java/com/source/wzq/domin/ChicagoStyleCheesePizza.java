package com.source.wzq.domin;

import com.source.wzq.supper.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        pizzaName = "芝加哥风味的奶酪披萨";
    }

    @Override
    public void cut() {
        System.out.println(pizzaName + " 乱刀切分");
    }
}
