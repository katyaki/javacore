package com.kitcenter.app.homework.lesson7;

public class DoWhileMethod {
    public static int doWhile(int m, int v) {
        int e;
        do {
           e = (m*v*v)/2;
           m--;
        } while(m==4);
        return e;

    }
}
