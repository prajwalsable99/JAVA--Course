package com.company;
import java.util.*;
public class collec_4 {

    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>(6,0.5f);//16 el ,load factor 0.75
        hs.add(11);
        hs.add(22);
        hs.add(444);
        hs.add(11);
        for (int el: hs) {
            System.out.println(el);

        }

    }









}
