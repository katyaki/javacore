package com.kitcenter.app.classwork.lesson5;
import java.util.Scanner;

public class DefineNumber {

    public static void define() {

        Scanner scanner = new Scanner(System.in);

        double b = scanner.nextDouble();

        if (b%2 != 0) {

            System.out.println("b is Odd");
        }

       else
            {

                System.out.println("b is Even");
            }

        }
    }


