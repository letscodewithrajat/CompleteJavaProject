package com.rajat.functionalProgramming;

import java.util.List;

/**
 * @author rajatsrivastava
 **/
public class MethodReferencesRunner {
    public static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s -> s.length())
                .forEach(s -> System.out.println(s));

        System.out.println("Method reference");
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s -> s.length())
                .forEach(System.out::println);

        System.out.println("Method reference Internal");

        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s -> s.toLowerCase())
                .forEach(s -> MethodReferencesRunner.print(s));

        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s -> s.toLowerCase())
                .forEach(MethodReferencesRunner::print);

        System.out.println("Method reference on instance method");
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(String::length)
                .forEach(System.out::println);

        Integer max = List.of(23, 45, 67, 34).stream()
                //.filter(n -> n % 2 == 0)
                .filter(MethodReferencesRunner::isEven)
                //.max((n1, n2) -> Integer.compare(n1, n2))
                .max(Integer::compare)
                .orElse(0);
        System.out.println(max);

    }

    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }
}
