package com.rajat.exception;

/**
 * @author rajatsrivastava
 **/
public class ExceptionHandlingRunner2 {
    public static void main(String[] args) {
        method2();
        System.out.println("Main ended");
    }

    private static void method2() {
        method1();
        System.out.println("M2 ended");
    }

    private static void method1() {
        try {
            //String str = null;
            //str.length();
            int[] i = {1, 3};
            int number = i[3];
            System.out.println("M1 ended");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
