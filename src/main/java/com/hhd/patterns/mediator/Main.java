package com.hhd.patterns.mediator;

/**
 * 调停者模式
 * 对内的facade ex:mq
 * 内部的统一处理方法
 */
public class Main {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
