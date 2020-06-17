package com.hhd.patterns.chainOfResponsibility;

public interface Filter {
    boolean doFilter(Msg msg);
}
