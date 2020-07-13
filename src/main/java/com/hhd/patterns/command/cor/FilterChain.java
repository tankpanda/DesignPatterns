package com.hhd.patterns.command.cor;

import com.hhd.patterns.command.Command;
import com.hhd.patterns.command.Content;

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
    public boolean doFilter(Content content, FilterChain filterChain) {
        if (index >= filters.size()) {
            return false;
        }
        Filter filter = filters.get(index);
        index ++;
        return filter.doFilter(content, filterChain);
    }
}
