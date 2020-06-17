package com.hhd.patterns.chainOfResponsibility;

public class HtmlFiler implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("<","[");
        s = s.replace(">","]");
        msg.setMsg(s);
        return true;
    }
}
