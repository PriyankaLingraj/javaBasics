package com.exceptionhandling;

public class ThrowException {

    public static void m() {
        int a = 90 / 0;
        throw new ArithmeticException("is zero is not possible");
    }

    public static void main(String[] args) {
        m();
    }
}
