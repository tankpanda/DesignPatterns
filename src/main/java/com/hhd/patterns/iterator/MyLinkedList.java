package com.hhd.patterns.iterator;

public class MyLinkedList implements MyCollection {
    private Node head = null;
    private Node tail = null;
    private int index = 0;

    @Override
    public void add(Object o) {
        Node n = new Node(o);
        n.setNext(null);
        if (head == null) {
            head = n;
            tail = n;
        }

        tail.setNext(n);
        tail = n;
        index ++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public MyIterator iterator() {
        return new MyIterator() {
            private Node currentNode = head;

            @Override
            public boolean hasNext() {
                if (currentNode.equals(tail)) {
                    return false;
                }
                return true;
            }

            @Override
            public Object next() {
                currentNode = currentNode.getNext();
                return currentNode;
            }
        };
    }
}
