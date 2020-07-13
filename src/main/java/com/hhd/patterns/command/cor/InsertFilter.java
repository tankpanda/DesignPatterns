package com.hhd.patterns.command.cor;

import com.hhd.patterns.chainOfResponsibility.servlet.Req;
import com.hhd.patterns.chainOfResponsibility.servlet.Resp;
import com.hhd.patterns.command.Command;
import com.hhd.patterns.command.Content;
import com.hhd.patterns.command.DeleteCommand;
import com.hhd.patterns.command.InsertCommand;

public class InsertFilter implements Filter {
    @Override
    public boolean doFilter(Content content, FilterChain filterChain) {
        InsertCommand ic = new InsertCommand(content);
        ic.does();
        System.out.println("insert does===" + content.getS());
        filterChain.doFilter(content, filterChain);
        ic.undo();
        System.out.println("insert undo===" + content.getS());
        return true;
    }
}
