package com.kitcenter.app.homework.lesson7;


import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.mappers.CsvWithHeaderMapper;



@RunWith(JUnitParamsRunner.class)
public class DoWhileMethodTest {

    @Test
    @FileParameters(value = "src/test/resources/dowhilemeth.csv",
        mapper = CsvWithHeaderMapper.class)
    public static void doWhileMethodTestAdd(int m, int v, int e) {

        Assert.assertEquals(e, DoWhileMethod.doWhile(m,v));

    }


    @Test
    @FileParameters(value = "src/test/resources/data_set_2_2.csv",
    mapper = CsvWithHeaderMapper.class)
    public static void doWhileMethodTestAdd2(int m, int v,  char e){
        Assert.assertNotEquals(e, DoWhileMethod.doWhile(m,v));
    }


    @Test
    @FileParameters(value = "src/test/resources/dowhilemeth2.csv",
            mapper = CsvWithHeaderMapper.class)
    public static void doWhileMethodTestAdd3(int m, int v, double e){
        Assert.assertEquals(e, DoWhileMethod.doWhile(m,v),0);
    }








}
