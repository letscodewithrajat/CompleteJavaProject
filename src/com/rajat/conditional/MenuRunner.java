package com.rajat.conditional;

import java.util.Scanner;

/**
 * @author rajatsrivastava
 **/
public class MenuRunner {
    public static void main(String[] args) {
        char ch = 68;
        System.out.println("ch 15 = " + ch);
        System.out.println("ch 16 = " + ++ch);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int number1 = scanner.nextInt();
        System.out.println("The number you entered is : " + number1);

        System.out.print("Enter Number 2:");
        int number2 = scanner.nextInt();
        System.out.println("The number you entered is : " + number2);

        System.out.println("Choices are:");
        System.out.println("1 - Add:");
        System.out.println("2 - Subtract:");
        System.out.println("3 - Multiply:");
        System.out.println("4 - Divide:");

        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();

        System.out.printf("number1 is: %d ,number2 is: %d and choice is: %d", number1, number2, choice);

        System.out.println();
        //performOperationUsingIfElse(choice, number1, number2);
        performOperationUsingSwitch(choice, number1, number2);

    }

    private static void performOperationUsingIfElse(int choice, int number1, int number2) {
        if (choice == 1) {
            System.out.println("Result is:- " + (number1 + number2));
        } else if (choice == 2) {
            System.out.println("Result is:- " + (number1 - number2));
        } else if (choice == 3) {
            System.out.println("Result is:- " + (number1 * number2));
        } else if (choice == 4) {
            System.out.println("Result is:- " + (number1 / number2));
        } else {
            System.out.println("Invalid choice !!");
        }
    }


    private static void performOperationUsingSwitch(int choice, int number1, int number2) {
        switch (choice) {
            case 1:
                System.out.println("Result is:- " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result is:- " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result is:- " + (number1 * number2));
                break;
            case 4:
                System.out.println("Result is:- " + (number1 / number2));
                break;
            default:
                System.out.println("Invalid Operation !!!");
        }
    }
}
