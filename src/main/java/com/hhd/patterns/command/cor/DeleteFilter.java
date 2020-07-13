package com.hhd.patterns.command.cor;

import com.hhd.patterns.chainOfResponsibility.servlet.Req;
import com.hhd.patterns.chainOfResponsibility.servlet.Resp;
import com.hhd.patterns.command.Command;
import com.hhd.patterns.command.Content;
import com.hhd.patterns.command.DeleteCommand;

public class DeleteFilter implements Filter {
    @Override
    public boolean doFilter(Content content, FilterChain filterChain) {
        DeleteCommand dc = new DeleteCommand(content);
        dc.does();
        System.out.println("delete does===" + content.getS());
        filterChain.doFilter(content, filterChain);
        dc.undo();
        System.out.println("delete undo===" + content.getS());
        return true;
    }
}
