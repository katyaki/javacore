package com.kitcenter.runners.homework.Lesson13;

public class Human {

    private int age;
    private String name;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public String getName(String name){
        return name;
    }

    String newAge = "New age setted";
    String invalidAge = "Age invalid";

    public int getAge(){
        return age;
    }


    public String setAge(int age){

        if (age >= 1 && age <= 120) {
            this.age = age;
            return newAge;
        }

        else {
            return invalidAge;
        }
    }

}
