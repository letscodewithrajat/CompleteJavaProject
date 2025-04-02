package com.rajat.oops.abstraction;

/**
 * @author rajatsrivastava
 **/
public abstract class AbstractRecipe {

    public void execute() {
        getReady();
        doTheDish();
        cleanup();
    }

    //prepare
    abstract void getReady();

    //recipe
    abstract void doTheDish();

    //cleanup
    abstract void cleanup();
}
