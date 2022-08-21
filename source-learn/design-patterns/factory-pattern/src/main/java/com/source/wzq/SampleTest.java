package com.source.wzq;

import com.source.wzq.domin.store.NYPizzaStore;
import com.source.wzq.supper.PizzaStore;
import com.source.wzq.supper.PizzaEnum;

public class SampleTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza(PizzaEnum.CHEESE);
    }
}
