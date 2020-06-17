package com.hhd.patterns.chainOfResponsibility.servlet;

/**
 * request1 -> request2 ->response2 -> response1
 */
public class Main {
    public static void main(String[] args) {
        Req req = new Req();
        req.setS("ababababab");
        Resp resp = new Resp();
        resp.setS("bababababa");
        FilterChain fc = new FilterChain().add(new AFilter()).add(new BFilter());
        fc.doFilter(req, resp, fc);
        System.out.println(req.getS());
        System.out.println(resp.getS());
    }
}
