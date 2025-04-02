package com.rajat.functionalProgramming;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author rajatsrivastava
 **/
public class FPNumberRunner {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(4, 6, 7, 5, 13, 3, 15);

       /* IntStream.range(1, 11)
                .map(e -> e * e)
                .forEach(e -> System.out.println(e));*/

       /* int sumOfRange = IntStream.range(1, 11)
                .reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(sumOfRange);
*/

        Optional<Integer> max = List.of(1, 6, 3, 7, 2).stream()
                .max((n1, n2) -> Integer.compare(n1, n2));
        if (max.isPresent()) {
            System.out.println("Max:-> " + max.get());
        }
        Optional<Integer> min = List.of(1, 6, 3, 7, 2).stream()
                .min((n1, n2) -> Integer.compare(n1, n2));
        if (min.isPresent()) {
            System.out.println("Min:-> " + min.get());
        }

        List<Integer> oddNumberList = List.of(1, 6, 3, 7, 2).stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());

        System.out.println(oddNumberList);


        List<Integer> evenNumberList = List.of(1, 6, 3, 7, 2).stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumberList);

        List<Integer> squares = IntStream.range(1, 11)
                .map(n -> n * n)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(squares);



        /*List<String> words = List.of("Apple", "Cat", "Bat");

        words.stream().map(s -> s.toLowerCase())
                .forEach(s -> System.out.println(s));

        words.stream().map(s -> s.length())
                .forEach(s -> System.out.println(s));
*/
        /*numbers.stream().
                forEach(e -> System.out.println(e));*/
       /* int sum = getSumFP(numbers);
        int sumOfOddNumber = getSumOfOddNumber(numbers);
        System.out.println(sum);
        System.out.println(sumOfOddNumber);

        normalSum(numbers);*/

    }

    private static int getSumOfOddNumber(List<Integer> numbers) {
        int sumOfOddNumber = numbers.stream()
                .filter(e -> e % 2 != 0)
                .reduce(0, (num1, num2) -> num1 + num2);
        return sumOfOddNumber;
    }

    private static int getSumFP(List<Integer> numbers) {
        int sum = numbers.stream().reduce(0, (num1, num2) ->
        {
            System.out.println(num1 + " " + num2);
            return num1 + num2;
        });
        return sum;
    }

    private static void normalSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
