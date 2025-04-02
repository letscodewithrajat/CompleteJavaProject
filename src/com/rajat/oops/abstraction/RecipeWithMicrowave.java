package com.rajat.oops.abstraction;

/**
 * @author rajatsrivastava
 **/
public class RecipeWithMicrowave extends AbstractRecipe {
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("Do the dishes");
    }

    @Override
    void cleanup() {
        System.out.println("Clean utensils");
        System.out.println("Switch Off microwave");
    }
}
