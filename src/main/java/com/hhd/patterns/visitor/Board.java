package com.hhd.patterns.visitor;

public class Board extends ComputerPart {
    @Override
    void accept(Visitor v) {
        v.getBoard(this);
    }

    @Override
    double getPrice() {
        return 300;
    }
}
