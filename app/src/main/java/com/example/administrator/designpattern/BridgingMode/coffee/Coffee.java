package com.example.administrator.designpattern.BridgingMode.coffee;

import com.example.administrator.designpattern.BridgingMode.CoffeeAdditives;

/**
 * 作者：${mxyang} on 2017/4/5 16:12
 */
public abstract class Coffee {
    protected CoffeeAdditives coffeeAdditives;

    public Coffee(CoffeeAdditives coffeeAdditives) {
        this.coffeeAdditives = coffeeAdditives;
    }

    public abstract void makeCoffee();
}
