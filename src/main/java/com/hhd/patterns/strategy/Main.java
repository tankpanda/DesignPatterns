package com.hhd.patterns.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1,5,23,5,7,8,2,42,3,7};
        Cat[] cats = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
        SorterAble sorterAble = new SorterAble();
        sorterAble.sort(cats);
        System.out.println(Arrays.toString(cats));

        Sorter<Cat> sorter = new Sorter();
        sorter.sort(cats, (c1,c2)->{
            if (c1.getHeight() < c2.getHeight()) {
                return -1;
            }
            if (c1.getHeight() > c2.getHeight()) {
                return 1;
            }
            return 0;
        });
        System.out.println(Arrays.toString(cats));
    }
}
