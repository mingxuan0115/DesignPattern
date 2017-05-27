package com.example.administrator.designpattern.StateMode;

/**
 * 作者：${mxyang} on 2017/4/5 17:15
 */
public class Client {
    public static void main(String[] args) {
        TVController tvController=new TVController();
        tvController.powerOn();
        tvController.nextChannel();
        tvController.turnUp();
        tvController.powerOff();
        tvController.nextChannel();
    }
}
