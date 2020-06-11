package com.hhd.patterns.singleton;

public class InnerClassSingleton {

    private InnerClassSingleton() {}

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.INSTANCE;
    }

    private static class InnerClassHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
}
