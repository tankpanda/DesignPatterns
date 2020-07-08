package com.hhd.patterns.visitor;

public class PersonalVisitor implements Visitor {
    double totalPrice = 0D;

    @Override
    public void getCpu(Cpu cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void getMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.95;
    }

    @Override
    public void getBoard(Board board) {
        totalPrice += board.getPrice() * 0.8;
    }
}
