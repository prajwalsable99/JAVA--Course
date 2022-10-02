package com.company;
interface Processor{

    int x=90;
    void read_Data();

    void write_Data();
}

interface Memory{
    void RAM();
    void  ROM();
}

class AMD implements Processor,Memory{

    @Override
    public void read_Data() {
        System.out.println("[READING.....!]");

    }


    public void decode() {
        System.out.println("[DECODING....!]");
    }

    @Override
    public void write_Data() {
        System.out.println("[WRITING.....!]");
    }

    @Override
    public void RAM() {
        System.out.println(">>>RAM: 4GB>>>");
    }

    @Override
    public void ROM() {
        System.out.println(">>>ROM:512/1024 GB>>>");
    }
}
public class Interfaces {


    public static void main(String[] args) {

//        Processor obj=new Processor()


        AMD obj=new AMD();
        obj.read_Data();
        obj.decode();
        obj.write_Data();
        obj.RAM();
        obj.ROM();

//    obj.x=100 u cannot chnage var fro,m interface




    }
}
