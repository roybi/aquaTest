package com.example.java;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Zoo
{
    public static void main (String args[]) throws IOException, SAXException, ParserConfigurationException {
       // Animel animel1 = new Animel(5,"Male",12,false);
        //Animel animal2 =new Animel (7,"Female",15,true);
        Bird animal3 = new Bird(3,"Female",99,true,2,"Black & White");
        Bird animal4 = new Bird(9,"Male",77,false,2,"Blue");
        Chicken chik15= new Chicken(5,"Female",88,false,2,"white");
        Animel spar16 = new Sparrow(36,"male",9,false,2,"Gray");
        Animel fishi17= new FIsh (9,"Male",5,false);



        //animel1.eat();
        //animal2.sleep();
        //animal3.flyable();
        //animal4.flyable();
        //chik15.flyable();
        spar16.move();
        fishi17.move();




    }
}
