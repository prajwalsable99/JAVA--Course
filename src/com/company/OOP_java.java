package com.company;

 class Car{

    int id;
    float speed;
    public void show()
    {
        System.out.print("car id id "+id+" and speed is "+speed);
    }
}





public class OOP_java {


    public static void main(String[] args) {
        System.out.println("[ retrieving data..... ]");

        System.out.println("creating our own class");

    Car obj=new Car();
    obj.id=11;
    obj.speed=23.4f;
    obj.show();



    }
}
