package com.kitcenter.runners.homework.lesson14.Interface;

public abstract class Machine implements Run {

    final int maxSpeed = 120;
    final int minSpeed = 0;
    final int minQtyOfPassengers = 0;
    final int maxQtyOfPassengers = 16;
    String name;
    int speed;

    public Machine(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void showName(){
        System.out.println(name);
    }



}
