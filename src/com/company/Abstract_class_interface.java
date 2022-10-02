package com.company;


abstract class Abs
{
    public Abs() {
        System.out.println("BASE");
    }

    abstract public void abs_fun();

}
class child extends Abs{
    public child()
    {
        System.out.println("DERIVED");
    }
    @Override
    public void abs_fun(){
        System.out.println("HIIIIIIIII");
    }
}


public class Abstract_class_interface {


    public static void main(String[] args) {
        System.out.println("----------------");

//  not possible      Abs ob=new Abs()
        child obj=new child();
        obj.abs_fun();



    }










}
