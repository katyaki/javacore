package com.kitcenter.app.utils.runners;

import com.kitcenter.app.utils.convertors.PrimitiveConvertor;
import java.util.Scanner;

public class Lesson4Runner {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        int i = scanner.nextInt();



        PrimitiveConvertor convert = new PrimitiveConvertor();
     convert.charToInt();
     convert.floatToChar();
     convert.intToChar();


    }

//add scanner here






}