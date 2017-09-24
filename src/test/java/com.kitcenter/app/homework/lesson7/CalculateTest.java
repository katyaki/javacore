package com.kitcenter.app.homework.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.mappers.CsvWithHeaderMapper;


@RunWith(JUnitParamsRunner.class)

public class CalculateTest {
    @Test
    @FileParameters(value = "src/test/resources/data_set.csv",
            mapper = CsvWithHeaderMapper.class)

    public void calcTestAdd(int a, int b, int z) {

        Assert.assertEquals(z, Calculate.calc(a,b));

    }


    @Test
    @FileParameters(value = "src/test/resources/data_set_2_1.csv", mapper = CsvWithHeaderMapper.class)

    public void calcTestAdd2(int a, int b, int z) {

        Assert.assertNotEquals(z, Calculate.calc(a,b));

    }


    @Test
    @FileParameters(value = "src/test/resources/data_set_2_2.csv", mapper = CsvWithHeaderMapper.class)

    public void calcTestAdd3(int a, int b, char z) {

        Assert.assertNotEquals(z, Calculate.calc(a,b));

    }


    @Test
    @FileParameters(value = "src/test/resources/ifstat4.csv",
            mapper = CsvWithHeaderMapper.class)
    public void calcTestAdd4(int a, int b, double z) {

        Assert.assertNotEquals(z, Calculate.calc(a,b));
    }




}



