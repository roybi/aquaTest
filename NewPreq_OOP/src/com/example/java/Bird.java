package com.example.java;

public class Bird extends Animel
{


    int numOfWings;
    String colorOfWings;

    public Bird(int age, String gender, int weight, boolean mammal) {
        super(age, gender, weight, mammal);
    }

    @Override
    public void move() {
        System.out.println("The Birrd move- flying");
    }

    public Bird(int age, String gender, int weight, boolean mammal, int numOfWings, String colorOfWings) {
        super(age, gender, weight, mammal);
        this.numOfWings = numOfWings;
        this.colorOfWings = colorOfWings;
    }

    /*
    void flyable()
      {
        if (mammal=true)
         {
             System.out.println("Its not a Bird ");

        }
        if (mammal=false)
         {
             System.out.println("Its a Bird");
             System.out.println("The bird can fly if she have  " + numOfWings + " wings");
             System.out.println("The bird wings color is "+colorOfWings);

         }
         else
        {
            System.out.println("Its not a Bird and notBird");
        }
    }
*/

    public int getNumOfWings() {
        return numOfWings;
    }

    public void setNumOfWings(int numOfWings) {
        this.numOfWings = numOfWings;
    }

    public String getColorOfWings() {
        return colorOfWings;
    }

    public void setColorOfWings(String colorOfWings) {
        this.colorOfWings = colorOfWings;
    }
}
