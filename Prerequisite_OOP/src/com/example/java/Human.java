package com.example.java;

public class Human
{
    String name;
    int age;
    int hightInInches;
    String eyeColor;

    public  void speak()
    {
        System.out.println("Hello my name is "+name);
        System.out.println("I am  "+hightInInches);
        System.out.println("I am  "+ age+ " years old");
        System.out.println("My eys color is "+ eyeColor);

    }
    public void eat()
    {
        System.out.println(" Eating...");
    }

    public void walk ()
    {
        System.out.println(" Walking ");
    }

    public void work()
    {
        System.out.println(" Working");
    }
}
