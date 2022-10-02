package com.company;

public class Conditional_if_else {

    public static void main(String[] args){

//        System.out.println("[   if .. else....]");


//        1.if
//        2.if else
//
        int x=21;
        if(x>18){

            System.out.println("[ ACCESS GIVEN ,WELCOME !]");
        }
        else{
            System.out.println("[ ACCESS DENIED ,SORRY !]");
        }


        int age=49+1;
        boolean flag=(age==50);
        if(flag){

            System.out.println("[ 0000000!]");
        }
        else{
            System.out.println("[ %%%%%%%%% !]");
        }


        boolean a=true;
        boolean b=false;
        if (a && !b){
            System.out.println("OK" );

        }
        else {
            System.out.println("NOT OK");
        }


    }
}
