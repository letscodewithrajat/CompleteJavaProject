package com.rajat.exception;

import java.util.Scanner;

/**
 * @author rajatsrivastava
 **/
public class TryWithResourcesRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = {1, 2, 3, 4};
            int number = numbers[4];
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
