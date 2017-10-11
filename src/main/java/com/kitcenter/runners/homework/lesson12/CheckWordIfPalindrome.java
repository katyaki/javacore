package com.kitcenter.runners.homework.lesson12;

import java.io.*;

public class CheckWordIfPalindrome {

    static int numberOfLines = 18;

    public static String[] readWords(String fileName) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String[] words = new String[numberOfLines];
        for (int i = 0; i < words.length; i++) {
            words[i] = reader.readLine();
        }
        return words;
    }

    public static String[] ifWordIsPalindrome(String[] words) {
        for (int t = 0; t < numberOfLines; t++) {

            boolean isPalindrome = true;
            String word = words[t];
            int length = word.length();

            for (int k = 0; k < length / 2; k++) {

                isPalindrome = isPalindrome && (word.charAt(k) == word.charAt
                        (word.length() - k - 1));

                if(!isPalindrome)
                    break;
            }

            if (!isPalindrome) {
                word = word + " false";

            } else {
                word = word + " true";

            }
            words[t] = word;
        }
        return words;
    }


    public static void writeToFile(String[] words, String fileName) throws IOException {

        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(fileName)));


        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            builder.append(words[i]);
            builder.append("\n");
        }
        builder.delete(builder.length() - 1, builder.length() - 0);
        builder.append("\n");
        writer.write(builder.toString());
        writer.flush();
    }

    public static void main(String[] args) throws IOException {

        String[] words = ifWordIsPalindrome(readWords("src/main/resources/words.txt"));
        writeToFile(words, "src/main/resources/words_result.txt");

    }

}