package com.source.wzq.supper;

public abstract class Pizza {

    protected String pizzaName;


    public void prepare(){
        System.out.println(pizzaName + " 正在准备...");
    }

    public void bake(){
        System.out.println(pizzaName + " 正在烘培");
    }

    public void cut(){
        System.out.println(pizzaName + " 正在切割");
    }

    public void box(){
        System.out.println(pizzaName + " 正在打包");
    }
}
