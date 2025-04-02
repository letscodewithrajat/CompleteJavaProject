package com.rajat.oops.basics;

/**
 * @author rajatsrivastava
 **/
public class FanRunner {

    public static void main(String[] args) {

        Fan fan = new Fan("Manufacturer1", 3.5f, "White");
        //fan.isOn(true);
        fan.switchOn();
        System.out.println("Fan :- " + fan);
        fan.setSpeed((byte) 3);
        System.out.println("Fan :- " + fan);
        fan.switchOff();
        System.out.println("Fan :- " + fan);

    }
}
