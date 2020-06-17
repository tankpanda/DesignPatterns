package com.hhd.patterns.chainOfResponsibility;

public class Msg {
    String name;
    String msg;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Msg{");
        sb.append("name='").append(name).append('\'');
        sb.append(", msg='").append(msg).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
