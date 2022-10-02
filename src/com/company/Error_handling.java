package com.company;
import java.util.Scanner;
public class Error_handling {

    public static void main(String[] args) {
        int a=8;
        int b=0;
//        try{
//            int c=a/b;
//            System.out.println(c);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
//        System.out.println();
        //handling specific exceptions

        int []arr={1,2,3,4,5};

        Scanner sc=new Scanner(System.in);

        int j=0;
        System.out.println("enter index no:");

        try{
            int x=sc.nextInt();
            System.out.println("element is"+arr[x]);
            System.out.println("element division "+(arr[x]/j));


        }
        catch (ArrayIndexOutOfBoundsException AI)
        {
            System.out.println(AI);
        }
        catch (ArithmeticException A)
        {
            System.out.println(A);
        }
        catch (Exception E)
        {
            System.out.println(E);
        }


    }
}
