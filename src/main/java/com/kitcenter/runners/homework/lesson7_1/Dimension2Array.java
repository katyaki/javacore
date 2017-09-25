package com.kitcenter.runners.homework.lesson7_1;

import java.util.Random;

public class Dimension2Array {

    public static void main(String[] args) {

        Random rand = new Random();

        int[][] array = new int[8][5];

        for (int i = 0; i < array.length; i++) {

            for (int j =0; j < array[i].length; j++) {

                array[i][j] = Math.abs(rand.nextInt(89)) + 10;


                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
            }


        }

}
