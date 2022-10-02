package com.company;

public class Method_overloading {



    // will change the content of array (applicable for array and obj)
    static void change(int []x)
    {
        x[0]=100;

    }


    // method overloading

    static void avg(){

        System.out.println("[ average function ]");
    }

    static void avg(int x,int y,int z){

        System.out.println((x+y+z)/3);
    }
    static void avg(int x,int y){

        System.out.println((x+y)/2);
    }



    public static void main(String[] args) {

        System.out.println("[ ....INITIALIZING.....]");

        int []age={11,22,33,44,55};


        System.out.println(age[0]);

        change(age);

        System.out.println(age[0]);



        avg();
        avg(10,14);
        avg(17,18,19);



    }
}
