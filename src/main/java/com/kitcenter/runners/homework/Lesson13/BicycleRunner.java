package com.kitcenter.runners.homework.Lesson13;

public class BicycleRunner {

    public static void main(String[] args) {

        BicycleWithRingInterface bicycleWithRing = new BicycleWithRing(5,6);
        bicycleWithRing.ring();

        Bicycle customBicycle = new CustomBicycle(4,17);
        customBicycle.ride();
        customBicycle.setGear(5);
        customBicycle.setSpeed(21);

    }

}
