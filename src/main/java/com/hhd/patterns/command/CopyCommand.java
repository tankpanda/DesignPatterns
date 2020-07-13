package com.hhd.patterns.command;

public class CopyCommand extends Command {

    Content c;

    public CopyCommand(Content c) {
        this.c = c;
    }

    @Override
    public void does() {
        c.s = c.s + c.s;
    }

    @Override
    public void undo() {
        c.s = c.s.substring(c.s.length()/2);
    }
}
