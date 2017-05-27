package com.example.administrator.designpattern.ProxyMode;

import com.example.administrator.designpattern.ProxyMode.base.IGame;

/**
 * Created by Administrator on 2017/5/26.
 */

public class Client {

    public static void main(String[] args) {
        //----------------静态代理--------------------------
//        IGame player = new GamePlayer("mxyang");
//        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(player);
//        gamePlayerProxy.move();
//        gamePlayerProxy.update();
//        gamePlayerProxy.attack();
//        gamePlayerProxy.dead();

        //------------动态代理-------------------
/**
 * 动态代理不需我们手动的去编写代理类，而是通过反射机制动态生成的
 * 如果我还想增加一个行为，只需要编写1，在接口中添加一个方法，2，在实现类中就行实现
 * 如果是静态代理，那么还需要在代理类中实现相应的行为
 */
        DynamicProxy dynamicProxy = new DynamicProxy();
        IGame player = (IGame) dynamicProxy.createProxy(new GamePlayer("mxyang"));
        player.attack();
        player.dead();
        player.update();
        player.move();
    }
}
