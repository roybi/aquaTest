package com.example.java;

public abstract class Animel
{
    int age;
    String gender;
    int waight;
    boolean mammal;

    public Animel(int age, String gender, int weight,boolean mammal)
    {
        this.age = age;
        this.gender = gender;
        this.waight = weight;
        this.mammal = mammal;
    }

    public void eat()
    {
        System.out.println("The Animel Can eat more if the gender is "+gender);

    }

    public void sleep()
    {
        System.out.println("As long as the animal age is bigger than "+age+" The animel can sleep more");

    }

     public abstract void move();


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getweight() {
        return waight;
    }

    public void setweight(int weight) {
        this.waight = weight;
    }

    public boolean isMammal() {
        return mammal;
    }

    public void setMammal(boolean mammal) {
        this.mammal = mammal;
    }
}
