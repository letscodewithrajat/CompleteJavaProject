package com.rajat.functionalProgramming;

import java.util.List;

/**
 * @author rajatsrivastava
 **/
public class FunctionalProgrammingRunner {
    public static void main(String[] args) {

        List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
        //printBasic(list);
        //printWithFunctionalProgramming(list);
        printWithFiltering(list);

    }

    private static void printBasic(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void printWithFunctionalProgramming(List<String> list) {
        list.stream().forEach(element -> System.out.println(element));
        //list.forEach(element -> System.out.println(element));
    }

    private static void printWithFiltering(List<String> list) {
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(e -> System.out.println(e));

        //list.forEach(element -> System.out.println(element));
    }
}
