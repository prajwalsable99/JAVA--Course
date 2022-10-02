package com.company;

public class Java_Arays {

    public static void main(String[] args) {

//        1.way

//        int []marks;
//        marks=new int[5];


//        2.way
        int []marks=new int[5];



        System.out.println(marks);
        marks[0]=77;
        marks[1]=66;
        marks[2]=54;
        marks[3]=88;
        marks[4]=96;
        System.out.println(marks[3]);


//      3,way

        int []age={11,33,42,56,78};




        //finding length of array
        System.out.println(age.length);

        int n=age.length;
        System.out.println("age:");
        for(int i=0;i<n;i++){

            System.out.println(age[i]);
        }

//        for(int i=n-1;i>=0;i--){
//
//            System.out.println(age[i]);
//        }

        System.out.println("//   #####################################################");

        System.out.println("marks");
        for (int i :marks) {

            System.out.println(i);

        }

    }
}
