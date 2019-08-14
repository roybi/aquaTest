package com.example.java;

public class Sparrow extends Bird implements Flyable
{
    public Sparrow( int age, String gender, int weight, boolean mammal, int numOfWings, String colorOfWings ) {
        super(age, gender, weight, mammal, numOfWings, colorOfWings);
    }

    @Override
    public void fly()
    {
        System.out.println("Sparrow fly very High");

    }
}
