package com.rajat.oops.basics;

public class MotorBikeRunner {

    public static void main(String[] args) {

        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(80);
        MotorBike def = new MotorBike();
        ducati.start("Ducati");
        honda.start("Honda");
        ducati.setSpeed(100);
        honda.setSpeed(80);
        ducati.increaseSpeed(20);

    }
}
