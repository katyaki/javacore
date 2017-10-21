package com.kitcenter.runners.homework.lesson14.Interface;

public class WheelTractor extends Tractor {
    public WheelTractor(String name, int speed) {
        super(name, speed);
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public int getWeight() {
        return 3000;
    }

    @Override
    public int getQuantityOfPassengers() {
        return 2;
    }

    @Override
    public int getQuantityOfWheels() {
        return 4;
    }

}
