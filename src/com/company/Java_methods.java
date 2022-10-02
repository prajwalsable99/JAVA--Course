package com.company;

public class Java_methods {

    //1.static (call without obj)

    static int my_fun(int x,int y){

        return (x+y)*100;
    }

    //2.non-static (call with obj)
    void show(){
        System.out.println("HIIIIIII");
    }
    public static void main(String[] args) {
        System.out.println("[methods in java....]");


        int c;
        //1.call static
        c=my_fun(3,4);
        System.out.println(c);

        Java_methods obj=new Java_methods();
        //2.calling  non-static
        obj.show();
    }
}

