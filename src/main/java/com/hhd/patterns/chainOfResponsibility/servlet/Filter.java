package com.hhd.patterns.chainOfResponsibility.servlet;

public interface Filter {
    boolean doFilter(Req req, Resp resp, FilterChain filterChain);
}
