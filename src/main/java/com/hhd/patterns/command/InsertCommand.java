package com.hhd.patterns.command;

public class InsertCommand extends Command {

    Content c;
    String insertString = "insert";

    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    public void does() {
        c.s = c.s + insertString;
    }

    @Override
    public void undo() {
        c.s = c.s.substring(0, c.s.length() - insertString.length());
    }
}
