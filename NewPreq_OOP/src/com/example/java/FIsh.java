package com.example.java;

public class FIsh extends Animel
{

    public FIsh( int age, String gender, int weight, boolean mammal ) {
        super(age, gender, weight, mammal);
    }

    @Override
    public void move()
    {

        System.out.println("The fish is swimming - abstract move");
    }

    public void swim()
    {
        System.out.println(" Fish can swim");
    }
}
