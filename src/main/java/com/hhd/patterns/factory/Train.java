package com.hhd.patterns.factory;

public class Train implements Moveable {
    @Override
    public void go() {
        System.out.println("train go...");
    }
}
