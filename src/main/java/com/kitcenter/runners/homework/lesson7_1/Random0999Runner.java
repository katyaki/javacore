package com.kitcenter.runners.homework.lesson7_1;

import java.util.Random;

public class Random0999Runner {

    public static void main(String[] args) {


        Random rand = new Random();

        int[] huge_array = new int[15];

        int max = 0;
        int min = 0;
        int k = 0;

        for (int i = 0; i < huge_array.length; i++) {

            huge_array[i] = Math.abs(rand.nextInt(999));

        }

        for (int i = 0; i < huge_array.length; i++) {

            System.out.print(huge_array[i] + " ");
        }


        int n = huge_array[0];
        k = huge_array[0];

        for (int i = 0; i < huge_array.length; i++) {


            if (huge_array[i] > k) {

                k = huge_array[i];
            }

            max = k;

            if (huge_array[i] < n) {

                n = huge_array[i];

            }

            min = n;

        }

        System.out.println();

        System.out.println("max number is: " + max);

        System.out.println("min number is: " + min);

    }

}

