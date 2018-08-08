package com.example.java;

import java.net.HttpURLConnection;

public class Earth
{
    public static void main(String args[])
    {

        Human tom = new Human();
        tom.age=5;
        tom.eyeColor="blue";
        tom.heightInInches=13;
        tom.name="Tom Zsaki";

        System.out.println();
        System.out.println();
        
        tom.speak();

        Human jhol =new Human();
        jhol.name="jjol the best man";
        jhol.heightInInches=990;
        jhol.eyeColor ="Brown";
        jhol.age=24;


        jhol.speak();


    }
}
