package com.example.java;

public class Human
{
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public Human()
    {


    }

    public void speak()
    {
        System.out.println("Hello, my name is "+name);
        System.out.println("I am "+heightInInches+" Inches tall ");
        System.out.println("I am "+age+" years old ");
        System.out.println("My eye Color is "+eyeColor);
    }

    public void eat()
    {
        System.out.println("eating... ");

    }

    public void work()
    {
        System.out.println("working... ");
    }
}
