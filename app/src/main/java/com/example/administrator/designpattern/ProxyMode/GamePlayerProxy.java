package com.example.administrator.designpattern.ProxyMode;

import com.example.administrator.designpattern.ProxyMode.base.IGame;

/**
 * Created by Administrator on 2017/5/26.
 */

/**
 * 代理类
 * 现在需要找一个类替我们执行我们要执行的行为
 */
public class GamePlayerProxy implements IGame {
    private IGame player;

    public GamePlayerProxy(IGame player) {
        this.player = player;
    }

    @Override
    public void attack() {
        player.attack();
    }

    @Override
    public void move() {
        player.move();
    }

    @Override
    public void dead() {
        player.dead();
    }

    @Override
    public void update() {
        player.update();
    }
}
