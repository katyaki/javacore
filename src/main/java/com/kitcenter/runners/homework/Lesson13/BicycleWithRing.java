package com.kitcenter.runners.homework.Lesson13;

public class BicycleWithRing extends CustomBicycle implements BicycleWithRingInterface {

    public BicycleWithRing(int gear, int speed) {
        super(gear, speed);
    }


    @Override
    public void ring() {
        System.out.println("Di-ling!");
    }
}
