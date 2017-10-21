package com.kitcenter.runners.homework.lesson12;

public class FlowersRunner
{

    public static void main(String[] args)
    {

        Flower[] bucket = new Flower[7];
        bucket[0] = new Rose();
        bucket[1] = new Tulip();
        bucket[2] = new Orchid();
        bucket[3] = new Orchid();
        bucket[4] = new Orchid();
        bucket[5] = new Alstroemeria();
        bucket[6] = new Alstroemeria();

        int totalPriceOfbucket = 0;

        for (int i = 0; i < bucket.length; i++)
        {
           totalPriceOfbucket = totalPriceOfbucket + bucket[i].getPrice();
        }

        System.out.println(totalPriceOfbucket);


    }

}
