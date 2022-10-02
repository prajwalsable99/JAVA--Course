package com.company;

public class COnditional_Switch {


    public static void main(String[] args) {
        // if -else if -else
        int marks=63;

        if (marks>80)
        {
            System.out.println("good");
        }
        else if(marks>50)
        {
            System.out.println("average");
        }
        else if(marks>30){

            System.out.println("poor");
        }
        else {
            System.out.println("bhai fail hai tu...");
        }

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        int grade=62;
        switch (grade)
        {
            case 1:
                System.out.println(2);
                break;
            case 2:
                System.out.println(4);
                break;
            case 6:
                System.out.println(6);
                break;
            case 8:
                System.out.println(8);
                break;
            case 10:
                System.out.println(10);
                break;

            default:
                System.out.println("impossible");
        }

        System.out.println("[---------------------------------------------------]");










    }
}
