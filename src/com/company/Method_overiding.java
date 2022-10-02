package com.company;
class A{

    public int neg(int a)
    {
        return -a;
    }

    public int square(int b){
        return b+b;
    }
}

class B extends A{

    @Override
    public int square(int b){
        return b*b;
    }
}
public class Method_overiding {

    public static void main(String[] args) {

//        System.out.println("[method override]");


        A obj=new A();
        B obj2=new B();
        System.out.println(obj.square(4));
        System.out.println(obj2.square(4));





    }
}
