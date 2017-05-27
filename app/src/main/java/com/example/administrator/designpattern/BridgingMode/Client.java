package com.example.administrator.designpattern.BridgingMode;

import com.example.administrator.designpattern.BridgingMode.coffee.LargeCoffee;
import com.example.administrator.designpattern.BridgingMode.coffee.SmallCoffee;

/**
 * 作者：${mxyang} on 2017/4/5 16:20
 * 以 去咖啡店喝咖啡为例，我们假定咖啡有大杯加糖、大杯不加糖、小杯加糖和小杯不加糖四种
 */
public class Client {

    public static void main(String[] args) {
        Sugar sugar=new Sugar();

        Ordinary ordinary=new Ordinary();

        LargeCoffee largeCoffee=new LargeCoffee(sugar);
        largeCoffee.makeCoffee();

        SmallCoffee smallCoffee=new SmallCoffee(sugar);
        smallCoffee.makeCoffee();

        LargeCoffee largeCoffee1=new LargeCoffee(ordinary);
        largeCoffee1.makeCoffee();
    }
}
