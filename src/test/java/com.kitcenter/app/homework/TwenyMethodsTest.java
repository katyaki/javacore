package com.kitcenter.app.homework;
import org.junit.*;
import org.junit.Test;

public class TwenyMethodsTest {

    @Test
    public void devidingTest() // 1
            {
                int x = 4;
                int y = 2;
                int expRes = 2;
              Assert.assertEquals(expRes,TwenyMethods.deviding(x, y));
    }

    @Test
    public void devidingNgativeTet() { //9

        int y = 0;
        int x = 4;
        int expRes = 0;
        Assert.assertEquals(expRes, TwenyMethods.deviding(x,y));

    }

    @Test
    public void devidingNegativeNumbersTest() //10
    {
        int y = -2;
        int x = -2;
        int expRes = 1;
        Assert.assertEquals(expRes, TwenyMethods.deviding(x,y));

    }



    @Test
    public void sumTest() // 2
    {
        double a = 5.2;
        double b = 1.4;
        double exRes = 6.6;
        Assert.assertEquals(exRes, TwenyMethods.sum(a,b), 0);
    }

    @Test
    public void summTest() { //11

        double a = 1.1;
        double b = 2.32;
        double exRes = 3.42;
        Assert.assertEquals(exRes, TwenyMethods.sum(a,b),0);

    }


    @Test
    public void summTest2() { //12

        double a = -65.44;
        double b = 24.32;
        double exRes = -41.12;
        Assert.assertEquals(exRes, TwenyMethods.sum(a,b),0);

    }



    @Test
    public void sqTest() // 3
    {
        double f = 9.0;
        double eR = 3.0;
        Assert.assertEquals(eR, TwenyMethods.sq(f), 0);
    }

    @Test
    public void sqTest1() // 13
    {
        double f = 169.0;
        double eR = 13.0;
        Assert.assertEquals(eR, TwenyMethods.sq(f), 0);
    }


    @Test
    public void sqTest2() // 14
    {
        double f = 15.0;
        double eR = 3.872983346207417;
        Assert.assertEquals(eR, TwenyMethods.sq(f), 0);
    }



    @Test
    public void roundingTest()
    {  // 4
        double r = 4.75;
        double expecRes = 5.0;
        Assert.assertEquals(expecRes, TwenyMethods.rounding(r),0.25);

    }
    @Test
    public void roundingDecrTest()
    { //15
        double r = 1.2;
        double expecRes = 1.0;
        Assert.assertEquals(expecRes, TwenyMethods.rounding(r),0);

    }

    @Test
    public  void  roundingIncrTest() //16
    {
    double r = -5.8;
    double expecRes = -6.0;
    Assert.assertEquals(expecRes, TwenyMethods.rounding(r), 0);

    }




    @Test
    public void comparisonTest()
    { // 5
        int k = 6;
        int s = 4;
        int expectRes = 10;
        Assert.assertEquals(expectRes,TwenyMethods.comparison(k,s));
    }

    @Test
    public void comparison1() //17
    {
        int k = -2;
        int s = -4;
        int expectRes = -6;
        Assert.assertEquals(expectRes, TwenyMethods.comparison(k,s));

    }

    @Test
    public void comparison2() //18
    {
        int k = -6;
        int s = -2;
        int expectRes = 12;
        Assert.assertEquals(expectRes, TwenyMethods.comparison(k,s));

    }




    @Test
    public void factorialTest()
    { // 6
        int g = 6;
        int expeRes = 720;
        Assert.assertEquals(expeRes, TwenyMethods.factorial(g));
    }

    @Test
    public void factorialTest1()  //19
    {
        int g = 11;
        int expeRes = 39916800;
        Assert.assertEquals(expeRes, TwenyMethods.factorial(g));

    }



    @Test
    public void reversTest()
    {  // 7

        String input = "katya";
        String expected = "aytak";
        Assert.assertEquals(expected, TwenyMethods.revers(input));
    }


    @Test
    public void reversTest1() //20
    {
        String input = "hydroposium";
        String expected = "muisopordyh";
        Assert.assertEquals(expected, TwenyMethods.revers(input));
    }





    @Test
    public void modulTest()
    { //8

        int f = -6;
        int expectedR = 6;
        Assert.assertEquals(expectedR, TwenyMethods.modul(f));

    }






}

