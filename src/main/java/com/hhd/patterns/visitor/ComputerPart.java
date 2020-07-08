package com.hhd.patterns.visitor;

public abstract class ComputerPart {
    abstract void accept(Visitor v);
    abstract double getPrice();
}
