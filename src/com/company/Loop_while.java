package com.company;

public class Loop_while {


    public static void main(String[] args) {
        // write your code here
        System.out.println("[INTRODUCTION TO WHILE LOOP");

//        1.while-loop =>entry control

        int i=0;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }


//        2.do-while  =>atleast runs once,exit control

        int x=10;
        do{
            System.out.println(x*10);
            x--;
        }
        while (x>0);

//  3.for loop


        for(int j=1;j<=100;j=j+2)
        {
            System.out.println(j);
        }






    }
}
