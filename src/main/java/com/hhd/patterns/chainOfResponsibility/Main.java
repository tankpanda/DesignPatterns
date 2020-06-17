package com.hhd.patterns.chainOfResponsibility;

/**
 * 责任链模式
 */
public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("hello world, <html> fuck you man!");

//        String s = msg.getMsg();
//        s = s.replace("<","[");
//        s = s.replace(">","]");
//        s = s.replace("fuck","fxxk");
//        msg.setMsg(s);
//        System.out.println(msg);

        // demo1
//        FilterChain fc1 = new FilterChain();
//        fc1.add(new HtmlFiler()).add(new FilterChain().add(new WordFilter()));
//        fc1.doFilter(msg);
//        System.out.println(msg);

        // demo2
//        FilterChain fc2 = new FilterChain();
//        fc2.add(new WordFilter()).add(new FilterChain().add(new HtmlFiler()));
//        fc2.doFilter(msg);
//        System.out.println(msg);
    }
}