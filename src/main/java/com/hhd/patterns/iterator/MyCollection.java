package com.hhd.patterns.iterator;

public interface MyCollection {
    void add(Object o);
    int size();

    MyIterator iterator();
}
