package com.rajat.loop;

/**
 * @author rajatsrivastava
 **/
public class MyNumber {

    int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= this.number - 1; i++) {

            if (this.number % i == 0) {
                return false;
            }

        }
        return true;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int i = 1; i <= this.number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int sum = 0;
        for (int i = 2; i < this.number; i++) {
            if (this.number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;

    }

    public void printNumberTriangle() {
        for (int i = 1; i <= number; i++) {
            // Print leading spaces
            for (int s = number - i; s > 0; s--) {
                System.out.print("  "); // Two spaces for alignment
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= this.number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
        for (int i = 1; i <= this.number; i++) {
            for (int j = i; j <= this.number; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

    }
}
