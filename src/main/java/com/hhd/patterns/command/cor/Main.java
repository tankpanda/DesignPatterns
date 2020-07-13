package com.hhd.patterns.command.cor;

import com.hhd.patterns.chainOfResponsibility.servlet.Req;
import com.hhd.patterns.chainOfResponsibility.servlet.Resp;
import com.hhd.patterns.command.Content;
import com.hhd.patterns.command.DeleteCommand;
import com.hhd.patterns.command.InsertCommand;

import java.util.Scanner;

/**
 * request1 -> request2 ->response2 -> response1
 */
public class Main {
    public static void main(String[] args) {
        int cmdStr = 0;
        FilterChain fc = new FilterChain();
        Content c = new Content();
        while (cmdStr != -1) {
            cmdStr = new Scanner(System.in).nextInt();
            if (cmdStr == 1) {
                fc.add(new InsertFilter());
            }
            if (cmdStr == 2) {
                fc.add(new DeleteFilter());
            }
            if (cmdStr == 3) {
                fc.add(new CopyFilter());
            }
            if (cmdStr == 4) {
                fc.doFilter(c, fc);
            }
        }
        System.out.println(c.getS());
    }
}
