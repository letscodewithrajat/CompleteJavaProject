package com.rajat.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author rajatsrivastava
 **/
class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        return number % 2 == 0;
    }
}

class SystemConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer number) {
        System.out.println(number);
    }
}

class NumberSquareMapper implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer number) {
        return number * number;
    }
}

public class LambdaBehindTheSceneRunner {
    public static void main(String[] args) {


        List.of(23, 43, 34, 45, 48, 36).stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(e -> System.out.println(e));

        System.out.println("Behind the scene implementation");
        List.of(23, 43, 34, 45, 48, 36).stream()
                .filter(new EvenNumberPredicate())
                .map(new NumberSquareMapper())
                .forEach(new SystemConsumer());
    }
}
