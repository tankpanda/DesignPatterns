package com.hhd.patterns.command.cor;

import com.hhd.patterns.command.Command;
import com.hhd.patterns.command.Content;

public interface Filter {
    boolean doFilter(Content content, FilterChain filterChain);
}
