package com.hhd.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends Node {

    private List<Node> nodes = new ArrayList<>();
    private String name;

    public BranchNode(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public String getName() {
        return name;
    }
}
