package com.source.wzq;

import com.source.wzq.domin.coffees.HouseBlend;
import com.source.wzq.domin.seasoning.Milk;
import com.source.wzq.domin.seasoning.Mocha;
import com.source.wzq.supper.Beverage;

public class CoffeeTestDrive {

    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        Beverage houseBlend2 =new Milk(houseBlend);

        houseBlend2 = new Mocha(houseBlend2);

        System.out.println(houseBlend2.cost());
        System.out.println(houseBlend2.getDescription());
    }
}
