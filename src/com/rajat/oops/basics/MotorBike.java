package com.rajat.oops.basics;

public class MotorBike {

    private int speed;

    public MotorBike() {
        this(5);
    }

    public MotorBike(int speed) {
        super();
        this.speed = speed;
    }

    void start(String bike) {
        System.out.println("Started " + bike);
    }

    public int getSpeed() {

        return this.speed;
    }

    public void setSpeed(int speed) {

        if (speed > 0) {
            this.speed = speed;
        }

    }

    public void increaseSpeed(int speed) {

        // this.speed = this.speed + speed;
        setSpeed(this.speed + speed);
    }

    public void decreaseSpeed(int speed) {

        /*
         * if (this.speed - speed > 0) { this.speed = this.speed - speed; }
         */
        setSpeed(this.speed - speed);
    }


}
