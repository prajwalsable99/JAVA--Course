package com.company;

interface Engine{
    String [] power();
    void speed();
    default void showing()
    {
        System.out.println("[DEFAULT METHOD]");
    }

}
interface Framework{
    void chasis();
    void body();
}
class MyCar implements Engine,Framework{

    void wheels()
    {
        System.out.println("CEAT Tyres");
    }

    @Override
    public void chasis() {
        System.out.println("CARBON_STEEL");
    }

    @Override
    public void body() {
        System.out.println("METALLIC SILVER");
    }

    @Override
    public String []power() {
//        System.out.println("500 HP");
        String []engg={"prajwal","yash","Ash"};

        return engg;
    }

    @Override
    public void speed() {
        System.out.println("240 kMPh");
    }
    @Override
    public void  showing()
    {
        System.out.println("SHOWING OVERRIDEN default");
    }
}

public class Interfaces_Defaultmethods {


    public static void main(String[] args) {

        MyCar obj=new MyCar();
        String []arr=obj.power();

        for (String ele:arr
             ) {
            System.out.println(ele);
        }

        obj.showing();






    }

}
