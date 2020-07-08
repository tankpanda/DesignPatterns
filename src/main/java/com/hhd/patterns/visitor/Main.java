package com.hhd.patterns.visitor;

/**
 * 结构固定的情况下 动态改变内部元素
 */
public class Main {
    public static void main(String[] args) {
        PersonalVisitor personalVisitor = new PersonalVisitor();
        new Computer().accept(personalVisitor);
        System.out.println(personalVisitor.totalPrice);

        GroupVisitor groupVisitor = new GroupVisitor();
        new Computer().accept(groupVisitor);
        System.out.println(groupVisitor.totalPrice);
    }
}
