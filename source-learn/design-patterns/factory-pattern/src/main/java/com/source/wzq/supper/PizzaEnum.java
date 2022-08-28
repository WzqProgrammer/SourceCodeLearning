package com.source.wzq.supper;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PizzaEnum {

    CHEESE("Cheese", "奶酪披萨"),
    VEGGIE("Veggie", "素食主义披萨"),
    CLAM("Clam", "蛤利皮萨"),
    PEPPERONI("Pepperoni", "意大利热辣香肠披萨");

    private String code;
    private String msg;
}
