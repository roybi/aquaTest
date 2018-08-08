package com.example.java;

public class LearningArrays
{
    public static void main(String[] args)
    {
        double [] values= new double [100];
        values[0]=1000;
        values[1]=33.42;
        values[99]=9342;

        System.out.println(values[1]);
        System.out.println(values[0]);
        System.out.println(values[99]);

        String [] words = new String []{"my","Name","is"};

        System.out.println(words[1]);

        String [] word2 = new String[3];
        word2[0]= "My";
        word2[1]= "Hello";
        word2[2]= "more";

        System.out.println(word2[1]);


    }
}
