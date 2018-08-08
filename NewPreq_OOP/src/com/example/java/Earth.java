package com.example.java;

import java.net.HttpURLConnection;

public class Earth
{
    public static void main(String args[])
    {

        /*Human tom = new Human();
        tom.age=5;
        tom.eyeColor="blue";
        tom.heightInInches=13;
        tom.name="Tom Zsaki";

        tom.speak();*/

        Human jhol =new Human();
        jhol.name="jjol the best man";
        jhol.heightInInches=990;
        jhol.eyeColor ="Brown";
        jhol.age=24;

        jhol.speak();

        Human human1 = new Human("Tom",25,115,"Brown");
        Human human2 = new Human("Joe",78,13,"Black");
        Human human3 = new Human("Tal",64,23,"Bloue");

        human1.speak();
        human2.speak();
        human3.speak();
    }
}
