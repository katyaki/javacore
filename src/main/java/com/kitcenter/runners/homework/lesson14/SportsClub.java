package com.kitcenter.runners.homework.lesson14;

public abstract class SportsClub {

    String name;
    String location;

    public SportsClub(String name, String location){
        this.name = name;
        this.location = location;
    }

    public void showName()
    {
        System.out.println(name);
    }
    public void showLocation()
    {
        System.out.println(location);
    }
    public void showStatistics()
    {
        System.out.println("Wins " + wins());
        System.out.println("Defeats " + defeats());
        System.out.println("Draws " + draws());

    }

    public abstract int wins();
    public abstract int draws();
    public abstract int defeats();

}
