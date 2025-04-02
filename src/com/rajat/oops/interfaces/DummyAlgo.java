package com.rajat.oops.interfaces;

/**
 * @author rajatsrivastava
 **/
public class DummyAlgo implements ComplexAlgo {
    @Override
    public int complexAlgorithm(int number1, int number2) {
        return number1 + number2;
    }
}
