package com.kitcenter.runners.homework.lesson14;

public class HouseRunner {

    public static void main(String[] args) {
        House house = new House();
        house.getStuffs().add(new Bed());
        house.getStuffs().add(new Shower());

        System.out.println(house.getStuffs().size());

    }
}
