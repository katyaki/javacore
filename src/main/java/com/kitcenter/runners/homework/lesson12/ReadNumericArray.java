package com.kitcenter.runners.homework.lesson12;

import java.io.*;

public class ReadNumericArray {

    static int numberOfLines = 3;
    static int numberOfDigits = 4;


    public static String[] readFile(String fileName) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String[] lines = new String[numberOfLines];
        for (int i = 0; i<lines.length; i++){
            lines[i] = reader.readLine();
        }

        return lines;
    }

    public static int[][] stringArrayToIntArray(String[] lines) {

        int numbers[][] = new int[numberOfLines][numberOfDigits];

        for (int i = 0; i < numberOfLines; i++) {

            String[] strDigits = lines[i].split(", ");

            for (int j = 0; j < strDigits.length; j++) {
                numbers[i][j] = Integer.parseInt(strDigits[j]);
            }

        }

        return numbers;
    }

    public static int[] sortArrayLine(int[] arrayLine){

    boolean shouldContinue  = true;
    while (shouldContinue) {
        shouldContinue = false;

        for(int i=0; i<arrayLine.length-1; i++){

            if (arrayLine[i]>arrayLine[i+1]) {

                int buff = arrayLine[i];

                arrayLine[i] = arrayLine[i+1];

                arrayLine[i+1] = buff;

                shouldContinue = true;
            }

        }

    }

    return arrayLine;

    }

    public static int[][] sortArray(int[][] arrayToSort) {

        for(int i = 0; i < arrayToSort.length; i++) {

            arrayToSort[i] = sortArrayLine(arrayToSort[i]);
        }

        return arrayToSort;
    }

    public static void writeToFile(int[][] arrayToWrite, String fileName) throws IOException {

        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(fileName)));

        StringBuilder builder = new StringBuilder();

        for(int i = 0;i<arrayToWrite.length;i++) {

            for(int j = 0;j<arrayToWrite[i].length;j++) {
                builder.append(arrayToWrite[i][j]);
                builder.append(", ");
            }

            builder.delete(builder.length()-2,builder.length()-0);
            builder.append("\n");
        }

        writer.write(builder.toString());
        writer.flush();

    }

    public static void main(String[] args) throws IOException {

      int[][] intArray = stringArrayToIntArray(readFile("src/main/resources/numeric_array.txt"));
      int[][] sortedArray = sortArray(intArray);
      writeToFile(sortedArray,"src/main/resources/sorted_numeric_array.txt");

    }

}



