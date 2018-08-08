package com.example.java;

public class ControlFlow
{
    public static void main(String[] args)
    {
        boolean hungry = false;
        if (hungry)
        {
            System.out.println("Im starving");

        }
        else
        {
            System.out.println("I am not starving");

        }

        int hungerRating = 5;
        if (!(hungerRating != 6))
        {
            System.out.println("I am ");

        }
        else
        {
            System.out.println("I am not");
        }

        int favoritTemp = 75;

        int currentTemp=100;
        String opinion;

        if ((favoritTemp ==currentTemp)) {

            if (currentTemp < favoritTemp - 30) {
                opinion = "It's preety Dam Cold ...";

            } else if (currentTemp < favoritTemp - 20) {
                opinion = "It's cold but ...";

            } else if (currentTemp > favoritTemp + 10) {
                opinion = "It's hot here";
            } else {
                opinion = "It's a beutiful day";

            }
        }
        else {
            opinion = "Unknon temp";
        }
            System.out.println(opinion);

        int mounth = 2;
        String monthString;

        switch (mounth)
        {
            case 1: monthString="Jan";
            break;
            case 2: monthString ="Fab";
            break;
            case 3: monthString ="March";
            break;
            default: monthString="Unknon mounth";
            break;
        }
        System.out.println(monthString);

    }
}
