package com.company;
import java.util.*;
public class collec_2 {

    public static void main(String[] args) {



        LinkedList<Integer>l1=new LinkedList<>();

        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);


        l1.add(0,99);
        //11 will become 2nd and 99 will 1st

//        to replace
        l1.set(0,999);
        for (int el : l1) {
            System.out.println(el);

        }
        System.out.println("------------------");
        for (int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));

        }
        System.out.println("------------------");

        LinkedList<Integer>l2=new LinkedList<>();
        l2.add(777);
        l2.add(444);
        l1.addAll(l2);

        System.out.println("------------------------");
        for (int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));

        }
//        l1.clear();
//        System.out.println("------------------------");
//        for (int i=0;i<l1.size();i++)
//        {
//            System.out.println(l1.get(i));
//
//        }


        System.out.println(l1.contains(5));
        System.out.println(l1.contains(777));


        System.out.println("----------------------------------------");

        System.out.println(l1.indexOf(777));
//        gives first index,lastindexof()=>gives last
        System.out.println(l1.indexOf(5));

        System.out.println("---------------------------------------------");


    l1.addLast(3333);

        System.out.println("------------------------");
        for (int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));

        }
    }
}
