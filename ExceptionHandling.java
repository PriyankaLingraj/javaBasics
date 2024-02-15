package com.exceptionhandling;

public class ExceptionHandling {

    public static void checkedException() throws ClassNotFoundException {
        System.out.println("st1");
        Class.forName("java.lang.String23");
        System.out.println("st2");
    }

    public static void main(String[] args) {
        try {
            checkedException();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}