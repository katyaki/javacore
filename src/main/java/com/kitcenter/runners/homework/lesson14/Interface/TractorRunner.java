package com.kitcenter.runners.homework.lesson14.Interface;

public class TractorRunner {

    public static void main(String[] args) {


        Tractor tractor = new WheelTractor("T-150", 5);
        System.out.println("Tractor's name: " + tractor.name);
        System.out.println("Speed is: " + tractor.speed);
        System.out.println("Quanity of wheels: " + tractor.getQuantityOfWheels());

        System.out.println();

        Tractor tractor1 = new CaterpillarTractor("Caterpillar D3K2 Small Dozer", 6);
        System.out.println("Tractor's name: " + tractor1.name);
        System.out.println("Tractor's speed is: " + tractor1.speed);
        System.out.println("Quantity of rollers: " + tractor1.getQuantityOfWheels());


    }
}
