package com.hhd.patterns.memento;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Users\\dell\\Desktop\\test.data");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        oos.writeObject(new Person());

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        Person p = (Person) ois.readObject();
        System.out.println(p);

        // close stream
    }
}
