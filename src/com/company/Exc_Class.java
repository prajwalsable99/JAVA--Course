package com.company;

class MY_CUST_EXC extends Exception{
    @Override
    public String getMessage() {
        return  "<>MESSAGE<>::>greater than 50";
    }



    @Override
    public String toString() {
        return  "< TOSTRING  is normal>";
    }
}
public class Exc_Class {


    public static void main(String[] args) {
        int a=67;
        if (a>50) {
            try {
                throw new MY_CUST_EXC();
            }
            catch (Exception e){
                System.out.println(e);
                System.out.println(e.getMessage());
//                e.printStackTrace();

            }
        }

        System.out.println("qwwefnfnd");
    }
}
