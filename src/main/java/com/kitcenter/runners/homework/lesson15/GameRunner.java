package com.kitcenter.runners.homework.lesson15;

import java.util.Random;
import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {

        int answerYearOfBirth;

        Scientists[] scientists = Scientists.values();
        Random random = new Random();


        for (int i = 0; i < 3; i++) {

            Scientists scientist = scientists[random.nextInt(scientists.length)];

            System.out.println("Guess year of birth for the scientist: " + scientist.getFullName());

            Scanner scanner = new Scanner(System.in);
            answerYearOfBirth = scanner.nextInt();

            if (answerYearOfBirth == scientist.getYearOfBirth()) {

                System.out.println("That is correct answer !");

                System.out.println();

                System.out.println("Is pearson alive? Choose 1 if yes, and 0 if no: ");

                int input = scanner.nextInt();
                boolean isAlive = input == 1;

                if(isAlive == scientist.isAlive())
                {
                    System.out.println("Right answer");
                    System.out.println();
                }

                else
                {
                    System.out.println("Wrong");
                    System.out.println();
                    break;
                }


            } else {

                System.out.println("That is not correct");
                break;
            }

            if (i==2) {

                System.out.println("Congratulations! You won! :)");
            }
        }
    }
}


