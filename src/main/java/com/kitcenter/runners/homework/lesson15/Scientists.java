package com.kitcenter.runners.homework.lesson15;

import apple.laf.JRSUIConstants;

import java.util.Random;

enum Scientists {

    NEWTON ("Isaac Newton", 1642, 84, 1726), TESLA ("Nikola Tesla", 1856, 86 , 1943), EINSTEIN ("Albert Einstein", 1879, 76, 1955),  FORD ("Henry Ford", 1863, 83, 1947), ADA ("Augusta Ada King-Noel", 1815, 36, 1852), HAWKING ("Stephen William Hawking", 1942, 75, 0), EDISON ("Thomas Alva Edison", 1847, 84, 1931), KURI ("Marie Skłodowska Curie", 1867, 66, 1934), TURING ("Alan Mathison Turing", 1912, 41, 1954);

    private String fullName;
    private int yearOfBirth;
    private int age;
    private int yearOfDeath;

    private Scientists(String fullName, int yearOfBirth, int age, int yearOfDeath) {
    this.fullName = fullName;
    this.yearOfBirth = yearOfBirth;
    this.age = age;
    this.yearOfDeath = yearOfDeath;

    }

    public boolean isAlive(){
        return yearOfDeath == 0;
    }


    public String getFullName() {
        return fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getAge() {
        return age;
    }

    public int getYearOfDeath() {
        return yearOfDeath;
    }


}
