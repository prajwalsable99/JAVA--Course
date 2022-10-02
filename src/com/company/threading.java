package com.company;


//meth 1
class Mythread extends Thread{
    @Override
    public void run() {
        System.out.println("[THREADING ACTIVATED]");
        while (true) {
            System.out.println("[IN PROCESS |:::....|]");

        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run() {
        System.out.println("[THREADING ACTIVATED]");
        while (true) {

            System.out.println("-^-^_^_^_^_^_^_^_^_^_^_^__^_^_^");
        }
    }
}



//meth 2
class Myth_run_int1 implements Runnable{


    @Override
    public void run() {
        while (true) {

            System.out.println("000000000000000000000000000000");
        }
    }
}
class Myth_run_int2 implements Runnable{


    @Override
    public void run() {
        while (true) {

            System.out.println("111111111111111111111111");
        }
    }
}









public class threading {

    public static void main(String[] args) {

        Mythread t1=new Mythread();
        Mythread2 t2=new Mythread2();
//        t1.start();
//        t2.start();



//        t1.run();
//        t2.run();


        Myth_run_int1 goli1 =new Myth_run_int1();
        Myth_run_int2 goli2= new Myth_run_int2();

        Thread bandook1=new Thread(goli1);

        Thread bandook2=new Thread(goli2);

        bandook1.start();
        bandook2.start();

    }
}
