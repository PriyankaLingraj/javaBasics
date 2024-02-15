package com.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingException {

    public static void m() {

        FileInputStream file = null;

        try {
            File newFile = new File("Hello.txt");
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            file = new FileInputStream("Hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally will execute always");
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        m();
    }
}
