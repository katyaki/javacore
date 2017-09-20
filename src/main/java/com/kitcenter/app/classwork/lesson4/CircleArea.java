package com.kitcenter.app.classwork.lesson4;

import java.util.Scanner;

public class CircleArea {

    public static void calculate() {

        Scanner scanner = new Scanner(System.in);

        final double PI=3.14d;


double radius1 = scanner.nextDouble();
double radius2 = scanner.nextDouble();

double area1 = PI*radius1*radius1;
double area2 = PI*radius2*radius2;


if ((radius1 > radius2) || (area1 > area2)) {


    System.out.println("Area 1 is bigger ");
    System.out.println("Area 2 is smaller ");
}

else

{
    System.out.println("Area 2 is bigger ");
    System.out.println("Area 1 is smaller ");

}

}




}
