package com.kitcenter.app.homework.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.mappers.CsvWithHeaderMapper;



@RunWith(JUnitParamsRunner.class)

public class IfStatTest {

    @Test
    @FileParameters(value = "src/test/resources/data_set_2.csv",
            mapper = CsvWithHeaderMapper.class)
    public void IfStatTestAdd(int a, int b, int z) {

        Assert.assertEquals(z, IfStat.ifstat(a, b));


    }

    @Test
    @FileParameters(value = "src/test/resources/ifstat4.csv",
            mapper = CsvWithHeaderMapper.class)
    public void IfStatTestAdd2(int a, int b, double z) {

        Assert.assertNotEquals(z, IfStat.ifstat(a, b));
    }


    @Test
    @FileParameters(value = "src/test/resources/ifstat5.csv",
    mapper = CsvWithHeaderMapper.class)

    public void IfStatTestAdd3(int a, int b, double z){
        Assert.assertEquals(z, IfStat.ifstat(a,b),0);

    }



}


