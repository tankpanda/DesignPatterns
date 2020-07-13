package com.hhd.patterns.state;

public class SadState extends PersonState {
    @Override
    void say() {
        System.out.println("sad say");
    }

    @Override
    void smile() {
        System.out.println("sad smile");
    }

    @Override
    void cry() {
        System.out.println("sad cry");
    }
}
