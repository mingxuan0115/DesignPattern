package com.example.administrator.designpattern.BridgingMode.coffee;

import com.example.administrator.designpattern.BridgingMode.CoffeeAdditives;

/**
 * 作者：${mxyang} on 2017/4/5 16:18
 */
public class SmallCoffee extends Coffee {

    public SmallCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的" + coffeeAdditives.addSomething() + "咖啡");
    }
}
