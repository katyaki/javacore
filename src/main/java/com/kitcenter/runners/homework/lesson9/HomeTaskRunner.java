package com.kitcenter.runners.homework.lesson9;

import java.io.IOException;

public class HomeTaskRunner {

    static String [] tasks = null;

    public static void initTasks() {

        tasks = new String[4];

        tasks[0] = "Сделать HomeTaskRunner который будет вызывать меню со всеми домашними заданиями к уроку";

        tasks[1] = "Реализовать считывание сроки, которую введет пользователь.  Придумать и написать в коде 3 алгоритма определения ее палиндромности (можно ли читать ее задом наперед так же, как и в прямом порядке). Сравнение должно быть case-insensitive (то-есть слово Moom и moom должны быть оба палиндромами).";

        tasks[2] = "*** Реализовать считывание сроки, которую введет пользователь.  Придумать и написать в коде 5 алгоритмов определения ее палиндромности (включая 3 из предидущей задачи).";

        tasks[3] = "Создать раннеры для каждого ДЗ. Создать меню для запуска каждого пункта из каждого ДЗ. Все раннеры назвать как Hometask{номер домашней работы} и поместить в package runners.";
    }

    public static void main(String[] args) throws IOException {

        initTasks();

        System.out.println("Please enter number of task and press enter ");

        int number = System.in.read() - 48;

        System.out.println(tasks[number-1]);



    }






}
