package com.kitcenter.app.classwork.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.mappers.CsvWithHeaderMapper;


@RunWith(JUnitParamsRunner.class)

public class DataProviderMathFunctionsTest {
    @Test
    @FileParameters(value = "src/test/resources/data.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, Math.multiplyExact(argA, argB));
    }

}
