package com.kitcenter.runners.homework.lesson7_1;

public class OddNumbersRunner {


    public static void main(String[] args) {


        int[] odd_array = new int[50];

        for (int i = 1; i < 100; i = i+2) {

            odd_array[i/2] = i;

        }

        for (int i = 0; i < odd_array.length; i++) {

            System.out.print(odd_array[i] + " ");

        }

        System.out.println();

        for (int i = odd_array.length - 1; i >= 0; i-- ) {

            System.out.print(odd_array[i] + " ");
        }




    }

}
