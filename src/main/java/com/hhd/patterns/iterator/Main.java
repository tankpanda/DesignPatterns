package com.hhd.patterns.iterator;

public class Main {
    public static void main(String[] args) {
//        MyCollection list = new MyArrayList();
//        for (int i = 0; i < 15; i++) {
//            list.add("s" + i);
//        }
//
//        MyIterator it = list.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

        MyCollection link = new MyLinkedList();
        for (int i = 0; i < 15; i++) {
            link.add("s" + i);
        }

        MyIterator it1 = link.iterator();
        while(it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
