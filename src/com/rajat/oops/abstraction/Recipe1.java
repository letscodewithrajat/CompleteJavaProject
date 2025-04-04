package com.rajat.oops.abstraction;

/**
 * @author rajatsrivastava
 **/
public class Recipe1 extends AbstractRecipe {
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("Do the dishes");
    }

    @Override
    void cleanup() {
        System.out.println("Clean utensils");
    }
}
