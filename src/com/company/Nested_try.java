package com.company;

public class Nested_try {

    public static void main(String[] args) {

        int []arr={1,2,3};
        try {

            System.out.println(23/0);
            try{
                System.out.println(arr[5]);
                System.out.println("11111");
            }
            catch (ArrayIndexOutOfBoundsException A){

                System.out.println("LEV 2 "+A);
            }

        }
        catch (Exception e)
        {
            System.out.println("LEV 1 "+e);
        }
    }
}
