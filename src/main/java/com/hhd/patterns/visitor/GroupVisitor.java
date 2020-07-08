package com.hhd.patterns.visitor;

public class GroupVisitor implements Visitor {
    double totalPrice = 0D;

    @Override
    public void getCpu(Cpu cpu) {
        totalPrice += cpu.getPrice() * 0.7;
    }

    @Override
    public void getMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.8;
    }

    @Override
    public void getBoard(Board board) {
        totalPrice += board.getPrice() * 0.6;
    }
}
