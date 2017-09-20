package com.kitcenter.app.utils.convertors;

public class PrimitiveConvertor {

    int i;

    float f;

    char c = 2;

   public void floatToChar() {

      float f = (char) c;
       System.out.println("float is   " + f + " char was " + c);

   }

   public void intToChar() {

       int i = (char) c;
       System.out.println("int is   " + i + " char was " + c);

   }


    public void charToInt() {

        int c = Character.getNumericValue('3');
        System.out.println("char is  " + c + " int was " + i);

   }


}
