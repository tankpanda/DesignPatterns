package com.hhd.patterns.bridge;

public class ColdAnimal extends Animal {
    public ColdAnimal(AnimalImpl impl) {
        super.impl = impl;
    }
}
