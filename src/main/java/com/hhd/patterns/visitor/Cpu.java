package com.hhd.patterns.visitor;

public class Cpu extends ComputerPart {
    @Override
    void accept(Visitor v) {
        v.getCpu(this);
    }

    @Override
    double getPrice() {
        return 200;
    }
}
