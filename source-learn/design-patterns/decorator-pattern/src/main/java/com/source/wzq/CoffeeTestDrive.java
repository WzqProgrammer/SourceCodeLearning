package com.source.wzq;

import com.source.wzq.domin.coffees.HouseBlend;
import com.source.wzq.domin.seasoning.Milk;
import com.source.wzq.domin.seasoning.Mocha;
import com.source.wzq.supper.Beverage;

import java.util.ArrayList;

public class CoffeeTestDrive {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);



        Beverage houseBlend = new HouseBlend();
        Beverage houseBlend2 =new Milk(houseBlend);

        houseBlend2 = new Mocha(houseBlend2);

        System.out.println(houseBlend2.cost());
        System.out.println(houseBlend2.getDescription());
    }
}
