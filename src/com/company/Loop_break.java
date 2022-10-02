package com.company;

public class Loop_break {


    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world!");

//        1.break

        for (int i=0;i<15;i++)
        {
            if( i==6)
            {
                System.out.println("ERROR");
                break;
            }
            System.out.println(i+100);


        }

//        2.continue

        for (int j=0;j<15;j++)
        {
            if( j==6)
            {
                System.out.println("ERROR");
                continue;
            }
            System.out.println(j);

        }















    }
}
