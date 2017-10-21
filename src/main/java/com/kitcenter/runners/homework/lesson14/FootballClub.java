package com.kitcenter.runners.homework.lesson14;

public class FootballClub extends SportsClub {


    public FootballClub(String name, String location) {
        super(name, location);
    }

    @Override
    public int wins() {
        return 4;
    }

    @Override
    public int draws() {
        return 5;
    }

    @Override
    public int defeats() {
        return 2;
    }
}
