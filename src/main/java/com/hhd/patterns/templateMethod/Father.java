package com.hhd.patterns.templateMethod;

public abstract class Father {
    void m() {
        op1();
        op2();
    }

    abstract void op1();
    abstract void op2();
}
