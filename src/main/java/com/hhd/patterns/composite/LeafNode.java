package com.hhd.patterns.composite;

public class LeafNode extends Node{
    private String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
