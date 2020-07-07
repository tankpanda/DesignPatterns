package com.hhd.patterns.flyweight;

/**
 * 重复利用对象
 */
public class Main {
    public static void main(String[] args) {
        CarPool carPool = new CarPool();
        for (int i = 0; i < 10; i++) {
            Car car = carPool.getCar();
            System.out.println(car);
        }
    }
}
