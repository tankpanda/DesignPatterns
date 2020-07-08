package com.hhd.patterns.proxy.statics;

public class CarTimeProxy implements Movable{
    private Movable m;

    public CarTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
