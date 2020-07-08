package com.hhd.patterns.visitor;

public interface Visitor {
    void getCpu(Cpu cpu);
    void getMemory(Memory memory);
    void getBoard(Board board);
}
