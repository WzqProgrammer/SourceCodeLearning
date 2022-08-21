package com.source.wzq;

import com.source.wzq.domin.PizzaStore;
import com.source.wzq.supper.PizzaEnum;

public class SampleTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(PizzaEnum.CLAM);
    }
}
