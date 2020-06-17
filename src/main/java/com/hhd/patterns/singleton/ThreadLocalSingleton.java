package com.hhd.patterns.singleton;

public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> INSTANCE =  ThreadLocal.withInitial(ThreadLocalSingleton::new);

    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getInstance() {
        return INSTANCE.get();
    }
}
