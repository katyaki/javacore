package com.kitcenter.runners.homework.lesson14.Interface;

public class Tractor extends Machine {


    public Tractor(String name, int speed) {
        super(name, speed);
    }

    @Override
    public int getSpeed() {
        return 5;
    }

    @Override
    public int getWeight() {
        return 3000;
    }

    @Override
    public int getQuantityOfPassengers() {
        return 12;
    }

    @Override
    public int getQuantityOfWheels() {
        return 4;
    }
}
