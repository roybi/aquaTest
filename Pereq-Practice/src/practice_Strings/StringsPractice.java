package practice_Strings;

public class StringsPractice
{
    public static  void main (String[]args)
    {
        String a ="hello  ";
        String b= "there";
        System.out.println(a.length());

        String str ="ABCDEFG";
        str.length();
       String extractStrings =  str.substring(1);
        System.out.println(str);
        System.out.println(extractStrings);

        if (a.equals("hello"))
        {
            System.out.println("Print -"+a);
        }
        if (!b.equals("theres"))
        {
            System.out.println("B is in not equals to - theres");
        }
        if (b.equalsIgnoreCase("THere"))
        {
            System.out.println("Printed there ");
        }

        System.out.println("the third charchter from hello is - "+a.charAt(3));

        System.out.println(a.charAt(-13));

        //index of string

        //find where the "there ina string - left to right

        String str2="Hello there yogi";

        System.out.println(str2.indexOf("there"));

        // search in a string from index Of left to right where

        System.out.println(str2.indexOf("there"));

        int indexOfLast= str2.lastIndexOf("yogi",3);


    }




}
