package com.hhd.patterns.proxy.statics;

public class CarLogProxy implements Movable{
    private Movable m;

    public CarLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("log proxy start");
        m.move();
        System.out.println("log proxy end");
    }
}
