package com.kitcenter.app.homework;

public class TwenyMethods {


    public static int deviding(int x, int y) //1
    {

        if (y > 0) {
            return x / y;
        }

        if (x < 0 && y<0) {

            return y/x;

    }

        else {

            return y;
        }
    }


    public static double sum(double a, double b) //2
    {

        return a+b;
    }

    public static double sq(double f)      //3
    {

        return Math.sqrt(f);
    }

    public static double rounding(double r) //4
    {

        return Math.round(r);
    }

    public static int comparison(int k, int s) { //5
        if (k > s) {

            return k + s;
        } else {

            return k * s;
        }
    }

    public static int factorial(int g) //6

    {
        int m = 1;

        for (int i = 2; i <= g; i++)
        {
            m = m*i;

        }

        return m;


    }

    public static String revers(String input)  //7
    {
        StringBuilder output = new StringBuilder();
        char[] inputArray = input.toCharArray();

        for (int i = inputArray.length - 1; i >= 0; i--)
        {
           output.append(inputArray[i]);

        }

        return output.toString();
    }

    public static int arythProgress(int l, int d, int n)  //8
    {

        int an = l;

        for (int i = 0; i < n ; i++ )
        {
            an+=d;

        }

        return an;
    }

    public static double average( double s, double z, double p ) //9
    {
        double o = (s+z+p)/3;
        return o;

    }

    public static int modul(int f) {

        int u = Math.abs(f);
        return u;

    }




    }





