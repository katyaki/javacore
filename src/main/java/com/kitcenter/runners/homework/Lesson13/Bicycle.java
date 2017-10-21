package com.kitcenter.runners.homework.Lesson13;

public abstract class Bicycle {

    protected int speed;
    protected int gear;


    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;

    }

    public void ride() {
        System.out.println("Wroom!");
    }

    public abstract void setSpeed(int speed);

    public abstract void setGear(int gear);
}
