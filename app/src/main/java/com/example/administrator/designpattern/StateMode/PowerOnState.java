package com.example.administrator.designpattern.StateMode;

/**
 * 作者：${mxyang} on 2017/4/5 17:05
 */
public class PowerOnState implements TVState{
    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }
}
