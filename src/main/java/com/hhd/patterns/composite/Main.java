package com.hhd.patterns.composite;

/**
 * 树状结构
 */
public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode c1 = new BranchNode("c1");
        BranchNode c2 = new BranchNode("c2");
        Node c11 = new LeafNode("c11");
        Node c12 = new LeafNode("c12");
        BranchNode c21 = new BranchNode("c21");
        Node c211 = new LeafNode("c211");
        Node c212 = new LeafNode("c212");

        root.addNode(c1);
        root.addNode(c2);
        c1.addNode(c11);
        c1.addNode(c12);
        c2.addNode(c21);
        c21.addNode(c211);
        c21.addNode(c212);

        tree(root, 0);
    }

    static void tree(Node n, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        n.print();
        if (n instanceof BranchNode) {
            for (Node c : ((BranchNode) n).getNodes()) {
                tree(c, depth + 1);
            }
        }
    }
}
