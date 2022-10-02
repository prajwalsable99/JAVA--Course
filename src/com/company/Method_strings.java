package com.company;
import java.util.Scanner;

public class Method_strings {


    public static void main(String[] args) {



        String x="PraJwal";
        System.out.println(x);

//  1.length of string  length()
        System.out.println(x.length());


//  2.convert to lowercase  toLowerCase()
        String l=x.toLowerCase();
        System.out.println(l);


//  3.convert to uppercase  toUpperCase()
        String u=x.toUpperCase();
        System.out.println(u);

//  4.remove start and end white/blank spaces  trim()
        String blank_space="   abc-  ";
        String trim_res=blank_space.trim();
        System.out.println(blank_space);
        System.out.println(trim_res);


//  5.SubString  substring(start,end)
    //Prajwal=>returns substring from (start to end-1)
        String substr1=x.substring(2);
        String substr2=x.substring(1,4);
        System.out.println(substr1);
        System.out.println(substr2);


//  6.replace all occurences   replace(bef,aft)

        String rep=x.replace('a','x');
        System.out.println(rep);

//  7.startsWith(str),endsWith(str) returns true or False

        String se="apple";
//        System.out.println(se.startsWith("a"));
//        System.out.println(se.startsWith("A"));
//        System.out.println(se.startsWith("f"));
//        System.out.println(se.startsWith("apple"));
//
//
//        System.out.println(se.endsWith("e"));
//        System.out.println(se.endsWith("E"));
//        System.out.println(se.endsWith("k"));


//  8.charAt(loc)  =>return char at loc :    if loc>len =>error

        System.out.println(x.charAt(2));

//  9.indexOf(loc)=>  if  substr not present return -1 else return index
        String ti="prajwal";
        System.out.println(ti.indexOf("x"));
        // can alsoe give offset(substr,offset)

//  10.lastindexOf(loc)=>  if  substr not present return -1 else return index
        String li="prajwal";
        System.out.println(li.lastIndexOf("a",3));

//  11.equals()
        String h="lake";
        String i="Lake";
        System.out.println(h.equals(i));

        System.out.println(h.equalsIgnoreCase(i));



//  12.escape sequence characters

//        \n        =>newline
//        \t        =>tab
//         \'       =>single quote
//          \\      =>backslash
//          \"      =>double quote



        String A11="Camel";
        String B11="Xavier";
//        13   lexographic   = : return 0 else diff //
        System.out.println(A11.compareTo(B11));
        System.out.println(B11.compareTo(A11));
        System.out.println("abc".compareTo("abc"));

        String Cx=new StringBuilder(A11).reverse().toString();
        System.out.println(Cx);

//        System.out.println(String.);








    }
}
