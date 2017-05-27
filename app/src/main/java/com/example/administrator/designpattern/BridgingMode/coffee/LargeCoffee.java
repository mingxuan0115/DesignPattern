package com.example.administrator.designpattern.BridgingMode.coffee;

import com.example.administrator.designpattern.BridgingMode.CoffeeAdditives;

/**
 * 作者：${mxyang} on 2017/4/5 16:16
 */
public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + coffeeAdditives.addSomething() + "咖啡");
    }
}
