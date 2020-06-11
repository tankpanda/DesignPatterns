package com.hhd.patterns.strategy;

@FunctionalInterface
public interface MyCompator<T> {
    int compare(T o1, T o2);
}
