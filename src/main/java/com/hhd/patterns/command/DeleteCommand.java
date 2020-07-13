package com.hhd.patterns.command;

public class DeleteCommand extends Command {

    Content c;
    String deleteString;

    public DeleteCommand(Content c) {
        this.c = c;
    }

    @Override
    public void does() {
        deleteString = c.s.substring(5);
        c.s = c.s.substring(0, 5);
    }

    @Override
    public void undo() {
        c.s = c.s + deleteString;
    }
}
