package com.kitcenter.app.classwork.lesson5;

 // 1. Preconditions: environment ready and works
import org.junit.*;
import org.junit.Test;


public class MathFuncTest {

        @Test
        public void multiplyTest() {
            int a = 1; // 2. Steps, assign variables and call method
            int b = 2;
            int expResult = 2; // 3. Pass/fail criteria: assert that 1*2=2
            Assert.assertEquals(expResult, MathFunc.multiply(a, b));
        }
     // 4. post conditions – JUnit do them instead of us


        @Test(timeout = 1000)
        public void infinityTest() {
            while (true);

        }
}
