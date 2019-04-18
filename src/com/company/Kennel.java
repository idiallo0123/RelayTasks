package com.company;

import java.util.ArrayList;

public class Kennel
{
    ArrayList<Pet> petList = new ArrayList<>();

    public Kennel(Pet[] petArray)
    {
        for(Pet p : petArray)
        {
            petList.add(p);
        }
    }

    public void allSpeak()
    {
        System.out.println(.get);
    }
}
