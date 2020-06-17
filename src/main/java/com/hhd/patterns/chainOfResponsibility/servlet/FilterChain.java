package com.hhd.patterns.chainOfResponsibility.servlet;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

    private List<Filter> filters = new ArrayList<>();
    private int index = 0;

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Req req, Resp resp, FilterChain filterChain) {
        if (index >= filters.size()) {
            return false;
        }
        Filter filter = filters.get(index);
        index ++;
        return filter.doFilter(req, resp, filterChain);
    }
}
