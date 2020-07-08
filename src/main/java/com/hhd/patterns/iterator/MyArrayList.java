package com.hhd.patterns.iterator;

public class MyArrayList implements MyCollection {
    Object[] objects = new Object[10];

    private int index = 0;

    @Override
    public void add(Object o) {
        if (index >= objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index ++;
    }

    @Override
    public int size() {
        return index;
    }


    @Override
    public MyIterator iterator() {
        return new MyIterator() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                if (currentIndex == index) {
                    return false;
                }
                return true;
            }

            @Override
            public Object next() {
                return objects[currentIndex ++];
            }
        };
    }
}
