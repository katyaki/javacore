package com.kitcenter.runners.homework.lesson17;

public class PhoneBookRecord {

    String name;
    String phoneNumber;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PhoneBookRecord(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
