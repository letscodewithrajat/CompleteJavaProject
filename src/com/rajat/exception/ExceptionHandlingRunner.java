package com.rajat.exception;

/**
 * @author rajatsrivastava
 **/
public class ExceptionHandlingRunner {
    public static void main(String[] args) {
        method2();
        System.out.println("Main ended");
    }

    private static void method2() {
        method1();
        System.out.println("M2 ended");
    }

    private static void method1() {
        String str = null;
        str.length();
        System.out.println("M1 ended");
    }
}
