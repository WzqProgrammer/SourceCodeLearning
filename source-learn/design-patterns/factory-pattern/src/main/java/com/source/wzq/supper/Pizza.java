package com.source.wzq.supper;

public abstract class Pizza {

    protected Dough dough;
    protected Sauce sauce;

    protected PizzaIngredientFactory pizzaIngredientFactory;

    protected String pizzaName;

    /**
     * 所有种类pizza都需要准备材料
     */
    public abstract void prepare();

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
