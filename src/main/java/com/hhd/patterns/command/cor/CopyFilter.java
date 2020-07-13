package com.hhd.patterns.command.cor;

import com.hhd.patterns.command.Content;
import com.hhd.patterns.command.CopyCommand;
import com.hhd.patterns.command.DeleteCommand;

public class CopyFilter  implements Filter {
    @Override
    public boolean doFilter(Content content, FilterChain filterChain) {
        CopyCommand cc = new CopyCommand(content);
        cc.does();
        System.out.println("copy does===" + content.getS());
        filterChain.doFilter(content, filterChain);
        cc.undo();
        System.out.println("copy undo===" + content.getS());
        return true;
    }
}