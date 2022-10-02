package com.company;


class X{
    public void lang(){
        System.out.println("LANGUAGE-X");
    }
}
class Y extends X{
    @Override
    public void lang(){
        System.out.println("PYTHON-Y");
    }
}
public class Dynamic_methoddispatch {

    public static void main(String[] args) {
        System.out.println("--------------");
//        X obj=new X();
//        obj.lang();
//
//        Y obj2=new Y();
//        obj2.lang();


//        Y obj=new X(); not possible   X->Y
            X obj=new Y();             //x->Y
            obj.lang();   //Y will run b











    }
}
