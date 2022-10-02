package com.company;
import java.util.*;

public class collec_3 {

    public static void main(String[] args) {

        ArrayDeque<Integer> l=new ArrayDeque<>();//16 initial size
        l.add(11);
        l.add(22);
        l.add(33);
        l.addFirst(00);
        l.addLast(100);
        for (int el:l) {
            System.out.println(el);

        }
        System.out.println("________________");


        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}
