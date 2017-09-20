package com.kitcenter.app.classwork.lesson4;

public class NarrowCasting {
    int int1 = 0 ;
    float float1 = 3.14159f;

    public void narrowing() {
        int1 = (int) float1;
        System.out.println(int1);

    }
}
