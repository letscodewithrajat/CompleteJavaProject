package com.rajat.oops.interfaces;

/**
 * @author rajatsrivastava
 **/
public class Project {

    public static void main(String[] args) {
        // ComplexAlgo algo = new DummyAlgo();
        ComplexAlgo algo = new RealAlgo();
        System.out.println(algo.complexAlgorithm(10, 20));
    }

}
