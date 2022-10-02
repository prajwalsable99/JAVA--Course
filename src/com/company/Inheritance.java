package com.company;

class Fruit{
     private int size;

    public Fruit() {
        this.size = 0;
    }
    public void setSize(int x) {
         this.size=x;
    }

    public int getSize() {
        return size;
    }
    public void show1()
    {
        System.out.println("size : "+this.size);

    }


}
class Apple extends Fruit{

    int rate;
    public Apple(){
        this.rate=0;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    public void show2()
    {
        System.out.println("rate : "+this.rate);

    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("[INHERITANCE in JAVA]");
        Fruit base=new Fruit();
        base.setSize(10);
        base.show1();

        System.out.println("--------------------");
//        -----------------------------
        Apple der=new Apple();
        der.setSize(133);
        der.setRate(500);
        der.show1();
        der.show2();
//        der.size=11;
        der.show2();









    }
}
