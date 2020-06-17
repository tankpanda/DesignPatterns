package com.hhd.patterns.chainOfResponsibility;

public class WordFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("fuck","fxxk");
        msg.setMsg(s);
        return false;
    }
}
