package com.kitcenter.runners.homework.lesson17;

import java.util.LinkedList;

public class Category {

    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    LinkedList<PhoneBookRecord> phoneBookRecords = new LinkedList<>();

    public LinkedList<PhoneBookRecord> getPhoneBookRecords() {
        return phoneBookRecords;
    }

    public Category(String title){
        this.title = title;
    }

}
