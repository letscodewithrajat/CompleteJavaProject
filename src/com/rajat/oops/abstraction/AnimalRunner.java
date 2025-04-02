package com.rajat.oops.abstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author rajatsrivastava
 **/
abstract class Animal {
    abstract void bark();
}

class Dog extends Animal {

    @Override
    void bark() {
        System.out.println("Bhow Bhow");
    }
}

class Cat extends Animal {

    @Override
    void bark() {
        System.out.println("Meow Meow");
    }
}

public class AnimalRunner {
    public static void main(String[] args) {
       /* Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.bark();
        }
*/
        List<String> words = List.of("Apple", "Bat", "Cat");
        List<String> wordsAl = new ArrayList<>(words);
        Iterator iter = wordsAl.iterator();
        while (iter.hasNext()) {
            if (iter.next().toString().endsWith("at")) {
                iter.remove();
            }
            System.out.println(wordsAl);
        }

    }
}
