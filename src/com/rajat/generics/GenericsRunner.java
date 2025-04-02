package com.rajat.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajatsrivastava
 **/
public class GenericsRunner {
    static <X> X doubleValue(X value) {
        return value;
    }

    static <X extends List> void duplicate(X list) {
        //list.
        list.addAll(list);
    }

    static Number sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    static void addCoupleOfNumbers(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);

    }

    public static void main(String[] args) {

        List emptyList = new ArrayList<Number>();
        addCoupleOfNumbers(emptyList);
        System.out.println(emptyList);
        System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 56, 6)));
        System.out.println(sumOfNumberList(List.of(1.1, 2.2, 3.5, 4.6, 56.0, 6.7)));
        System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 56l, 6l)));

        String str = doubleValue(new String());
        Integer num = doubleValue(Integer.valueOf(3));
        ArrayList list1 = doubleValue(new ArrayList<>());

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
        duplicate(numbers);
        System.out.println(numbers);

        //MyCustomList<String> list = new MyCustomList();
        MyCustomList<Long> list = new MyCustomList();
        // list.addElement("Element 1 ");
        //list.addElement("Element 2 ");
        list.addElement(Long.valueOf("5"));
        //String value = list.get(0);
        Long value = list.get(0);
        System.out.println(value);
        System.out.println(list);
        MyCustomList<Integer> list2 = new MyCustomList();
        list2.addElement(Integer.valueOf(1));
        list2.addElement(Integer.valueOf(3));
        Integer number = list2.get(1);
        System.out.println(number);
        System.out.println(list2);
    }
}
