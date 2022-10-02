package com.company;
interface milk
{
    void filter();
    void heat();
}
interface sugar extends milk{
    void addit();
    void shake();
}
class drink implements sugar{
    @Override
    public void filter() {
        System.out.println("[1.filtering]");
    }

    @Override
    public void heat() {
        System.out.println("[2.heating]");

    }

    @Override
    public void addit() {
        System.out.println("[3.add sugar]");
    }

    @Override
    public void shake() {
        System.out.println("[4.shake it ]");
    }

    public void fin()
    {
        System.out.println("[  DRINK IS READY]");
    }
}


public class Inher_interfaces {
    public static void main(String[] args) {
        drink obj=new drink();
        obj.filter();
        obj.heat();
        obj.addit();
        obj.shake();
        obj.fin();
    }
}
