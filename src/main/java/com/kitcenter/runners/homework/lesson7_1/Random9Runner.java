package com.kitcenter.runners.homework.lesson7_1;

import java.util.Random;

public class Random9Runner {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] array_rand = new int [15];

        int count = 0;

        for (int i = 0; i < array_rand.length; i++) {

            array_rand[i] = Math.abs(rand.nextInt(10));


        }

        for (int i = 0; i < array_rand.length; i++) {
            System.out.println(array_rand[i]);
        }

        for (int i = 0; i < array_rand.length; i++) {

            if (array_rand[i]%2 == 0) {
                count++;
            }

        }

        System.out.println("count of even numbers: " + count);


    }
}
