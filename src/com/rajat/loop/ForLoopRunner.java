package com.rajat.loop;

/**
 * @author rajatsrivastava
 **/
public class ForLoopRunner {
    public static void main(String[] args) {
        /*
        for (; ; ) {
            System.out.println("For loop");
        }*/

        MyNumber myNumber = new MyNumber(6);
        boolean isPrime = myNumber.isPrime();
        System.out.println("isPrime:- " + isPrime);

        int sum = myNumber.sumUptoN();
        System.out.println(sum);
        int sumOfDivisors = myNumber.sumOfDivisors();
        System.out.println(sumOfDivisors);
        myNumber.printNumberTriangle();
    }
}
