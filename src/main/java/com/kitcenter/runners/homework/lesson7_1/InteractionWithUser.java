package com.kitcenter.runners.homework.lesson7_1;

import java.util.Random;

public class InteractionWithUser {

    public static void main(String[] args) {

        Random rand = new Random();

        int[][] array = new int[8][5];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = Math.abs(rand.nextInt(998)) + 1;

            }
        }

        int g;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                int count = 0;

                g = array[i][j];

                while (g != 0) {

                    g /= 10;

                    ++count;
                }

                System.out.print(" ");

                for(int n = 0; n < 3-count; n++)
                {
                    System.out.print(" ");
                }

                System.out.print(array[i][j]);
            }

            System.out.println();
        }
    }

}


