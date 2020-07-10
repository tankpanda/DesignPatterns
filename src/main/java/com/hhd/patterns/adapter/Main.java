package com.hhd.patterns.adapter;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * io
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String path = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))));
    }
}
