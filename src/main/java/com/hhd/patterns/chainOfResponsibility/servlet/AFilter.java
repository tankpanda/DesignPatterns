package com.hhd.patterns.chainOfResponsibility.servlet;

public class AFilter implements Filter{
    @Override
    public boolean doFilter(Req req, Resp resp, FilterChain filterChain) {
        req.setS(req.getS().replace("a","z"));
        filterChain.doFilter(req, resp, filterChain);
        resp.setS(resp.getS().replace("a","x"));
        return true;
    }
}
