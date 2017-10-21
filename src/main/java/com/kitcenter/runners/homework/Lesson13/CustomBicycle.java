package com.kitcenter.runners.homework.Lesson13;

public class CustomBicycle extends Bicycle {


    public CustomBicycle(int gear, int speed) {
        super(gear, speed);
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed is " + this.speed);
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("Gear is " + this.gear);
    }

    @Override
    public void ride() {
        System.out.println("Wshhhh!");
    }
}
