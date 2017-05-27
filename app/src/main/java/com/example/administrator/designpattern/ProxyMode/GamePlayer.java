package com.example.administrator.designpattern.ProxyMode;

import com.example.administrator.designpattern.ProxyMode.base.IGame;

/**
 * Created by Administrator on 2017/5/26.
 */

/**
 * RealSubject真是主题类
 * 在这里我们定义下玩家的实际行为：
 */
public class GamePlayer implements IGame {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println(name + "正在" + "攻击");
    }

    @Override
    public void move() {
        System.out.println(name + "正在" + "行走");
    }

    @Override
    public void dead() {
        System.out.println(name + "已经" + "死亡");
    }

    @Override
    public void update() {
        System.out.println(name + "已经" + "升级");
    }
}
