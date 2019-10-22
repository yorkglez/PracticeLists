package com.practicelists.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListApp
{
    public static void main(String[] args)
    {
        //List declaration
        List<Integer> numbersList;
        numbersList = new ArrayList<>();
        List<String> stringList;
        stringList = new ArrayList<>();

        //Object declaration
        Random random = new Random(System.nanoTime());

        //Generate random numbers
        for(int i = 0; i < 10; i++)
        {
            numbersList.add(random.nextInt(100)+1);
        }

        //Visualize numbers
        System.out.println("Integer list");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(numbersList.get(i)+" ");
        }

        //Add string to list
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("!!!");

        //Visualize stringList
        System.out.println("\n\nString list");
        for(int i = 0; i < 3; i++)
        {
            System.out.println(stringList.get(i));
        }

    }
}
