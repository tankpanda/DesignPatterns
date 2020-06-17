package com.hhd.patterns.chainOfResponsibility.servlet;

public class BFilter implements Filter {
    @Override
    public boolean doFilter(Req req, Resp resp, FilterChain filterChain) {
        req.setS(req.getS().replace("b","y"));
        filterChain.doFilter(req, resp, filterChain);
        resp.setS(resp.getS().replace("b","w"));
        return true;
    }
}
