package com.example.administrator.designpattern.StateMode;

/**
 * 作者：${mxyang} on 2017/4/5 17:11
 */
public class TVController implements PowerController {
    private TVState tvState;
    @Override
    public void powerOn() {
     tvState=new PowerOnState();
    }

    @Override
    public void powerOff() {
     tvState=new PowerOffState();
    }

    public void nextChannel(){
        tvState.nextChannel();
    }

    public void prevChannel(){
        tvState.prevChannel();
    }

    public void turnUp(){
        tvState.turnUp();
    }

    public void turnDown(){
        tvState.turnDown();
    }
}
