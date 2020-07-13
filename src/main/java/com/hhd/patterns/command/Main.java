package com.hhd.patterns.command;

public class Main {
    public static void main(String[] args) {
        Content content = new Content();
        InsertCommand insertCommand = new InsertCommand(content);
        insertCommand.does();
        System.out.println(content.s);
        insertCommand.undo();
        System.out.println(content.s);

        DeleteCommand deleteCommand = new DeleteCommand(content);
        deleteCommand.does();
        System.out.println(content.s);
        deleteCommand.undo();
        System.out.println(content.s);
    }
}
