package com.hhd.patterns.bridge;

public class WarmAnimal  extends Animal {
    public WarmAnimal(AnimalImpl impl) {
        super.impl = impl;
    }
}
