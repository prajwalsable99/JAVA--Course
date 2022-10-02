package com.company;

public class Recurrsion_java {


    static int fact(int x){

        int j=1;
        for (int i=1;i<=x;i++)
        {
            j=j*i;

        }
        return j;
    }

    static int fact_rec(int x){

        if(x==0)
        {
            return 1;
        }
        return x*fact_rec(x-1);
    }


    public static void main(String[] args) {
        System.out.println("[ !!! preparing resources.....]");

        int x=fact(0);
        System.out.println(x);
        x=fact_rec(10);
        System.out.println(x);
    }

}
