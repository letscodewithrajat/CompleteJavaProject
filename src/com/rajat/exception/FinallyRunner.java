package com.rajat.exception;

import java.util.Scanner;

/**
 * @author rajatsrivastava
 **/
public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] numbers = {1, 2, 3, 4};
            int number = numbers[4];
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("before scanner close");
            if (scanner != null) {
                scanner.close();
            }
        }

        System.out.println("just before closing main");
    }
}
