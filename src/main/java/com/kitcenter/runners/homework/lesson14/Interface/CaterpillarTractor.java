package com.kitcenter.runners.homework.lesson14.Interface;

public class CaterpillarTractor extends Tractor {

    public CaterpillarTractor(String name, int speed) {
        super(name, speed);
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public int getWeight() {
        return 4500;
    }

    @Override
    public int getQuantityOfPassengers() {
        return 2;
    }

    @Override
    public int getQuantityOfWheels() {
        return 12;
    }



}
