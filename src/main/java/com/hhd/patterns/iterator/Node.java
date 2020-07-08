package com.hhd.patterns.iterator;

public class Node {
    private Object o;
    private Node next;

    public Node(Object o) {
        this.o = o;
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Node{");
        sb.append("o=").append(o);
        sb.append('}');
        return sb.toString();
    }
}
