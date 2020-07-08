package com.hhd.patterns.visitor;

public class Memory extends ComputerPart{

    @Override
    void accept(Visitor v) {
        v.getMemory(this);
    }

    @Override
    double getPrice() {
        return 100;
    }
}
