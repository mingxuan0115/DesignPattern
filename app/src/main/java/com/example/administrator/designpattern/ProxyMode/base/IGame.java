package com.example.administrator.designpattern.ProxyMode.base;

/**
 * Created by Administrator on 2017/5/26.
 */

/**
 * Subject抽象主题类
 * 我们在这里定义一下游戏玩家的抽象行为：
 * 说一下代理模式的个人理解：
 * 比如一个人要卖房，此时他找到了一个中介，给中介提供相应的信息，如：房子价格，房子面积等信息
 * 中介就相当于代理-》这就是为啥代理里面需要传一个被代理者的对象
 * 卖房子的主人相当于被代理者--》写好自己的房子信息
 * 调用者相当于有人来询问房子的事情
 */
public interface IGame {
    public void attack();

    public void move();

    public void dead();

    public void update();

}
