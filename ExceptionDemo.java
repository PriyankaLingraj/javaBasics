package com.exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Started");
        try {
            String s = null;
            System.out.println(s.length());

            int arr[] = new int[2];
            arr[0] = 21;
            arr[1] = 22;
            arr[2] = 31;
            System.out.println(s.length());
        } catch (NullPointerException ex1) {
            ex1.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex2) {
            ex2.printStackTrace();
        }
        System.out.println("ended");
        System.out.println(12/4);
    }
}
